#!/usr/bin/env bash
set -eu

DEPLOY_KEY=${GITHUB_DEPLOY_KEY:-}
NEW_VERSION=${TRAVIS_TAG#"v"}

# Build the extension
yarn install
yarn build

# Update package.json and CHANGELOG.md
set-up-ssh() {
  echo "Setting up ssh..."
  mkdir -p $HOME/.ssh
  ssh-keyscan -t rsa github.com >> ~/.ssh/known_hosts
  git config --global user.name "Scala bot"
  git config --global user.email "$TRAVIS_BUILD_NUMBER@$TRAVIS_COMMIT"
  git config --global push.default simple
  DEPLOY_KEY_FILE=$HOME/.ssh/id_rsa
  echo "$GITHUB_DEPLOY_KEY" | base64 --decode > ${DEPLOY_KEY_FILE}
  chmod 600 ${DEPLOY_KEY_FILE}
  eval "$(ssh-agent -s)"
  ssh-add ${DEPLOY_KEY_FILE}
}
if [[ -n "$DEPLOY_KEY" ]]; then
  set-up-ssh
fi
git checkout -b travis-temp
yarn version --no-git-tag-version --new-version $NEW_VERSION
yarn github-changes -o scalameta -r metals-vscode --no-merges -t "VSCode Extension Changelog" -k $GITHUB_TOKEN
git commit -am "Update release notes for $TRAVIS_TAG"
git push origin HEAD:master

# Publish to VS Code Marketplace
yarn vscode:publish -p $VS_MARKETPLACE_TOKEN
