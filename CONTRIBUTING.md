# Contributing

This document explains the developer workflow for making changes to the
[Scala Syntax (official) extension](https://marketplace.visualstudio.com/items?itemName=scala-lang.scala)
for Visual Studio Code.

## Prerequisites

Make sure you have the following binaries installed:

- [`yarn`](https://yarnpkg.com/en/): to build the project
- [`code`](https://code.visualstudio.com/docs/setup/mac): to launch VS Code from
  the terminal.

## Building the project

First, install library dependencies. This step needs to re-run every time a new
dependency is added to `package.json`.

```bash
yarn install
```

Next, open the source language file `src/typescript/Scala.tmlanguage.ts` to make
changes to the code. To generate the the syntax definition file
`syntaxes/Scala.tmLanguage.json` with your local changes, run the following
command:

```bash
yarn build
```

The output tmLanguage file `syntaxes/Scala.tmLanguage.json` is tracked by git,
and is committed on every release (see [#23](https://github.com/scala/vscode-scala-syntax/pull/23)).
The output file is validated against the json schema before being written.

To run the tests, run the following command:

```bash
yarn test
```

## Installing the extension locally

Run the following commands to globally install this extension with your local
changes.

```bash
yarn install
yarn build

# replace `*` below with the version of the generated vsix file
code --install-extension scala-*.vsix
```
