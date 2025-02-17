#!/usr/bin/env bash
set -eux

AUTHOR=$GITHUB_ACTOR
echo "Pull request submitted by $AUTHOR";
signed=$(curl -s https://contribute.akka.io/cla/scala/check/$AUTHOR | jq -r ".signed");
if [ "$signed" = "true" ] ; then
  echo "CLA check for $AUTHOR successful";
else
  echo "CLA check for $AUTHOR failed";
  echo "Please sign the Scala CLA to contribute to the Scala compiler.";
  echo "Go to https://contribute.akka.io/cla/scala and then";
  echo "comment on the pull request to ask for a new check.";
  echo "";
  echo "Check if CLA is signed: https://contribute.akka.io/cla/scala/check/$AUTHOR";
  exit 1;
fi;
