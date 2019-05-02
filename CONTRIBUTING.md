# Contributing

This document explains the developer workflow for making changes to the
[Scala Syntax (official) extension](https://marketplace.visualstudio.com/items?itemName=scala-lang.scala)
for Visual Studio Code.

## Prerequisites

Make sure you have the following binaries installed:

- [`yarn`](https://yarnpkg.com/en/): to build the project
- [`vsce`](https://code.visualstudio.com/api/working-with-extensions/publishing-extension):
  to package the extension for VS Code.
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

The output tmLanguage file `syntaxes/Scala.tmLanguage.json` is marked as ignored
in git and shouldn't be commited into the repository. The output file is
validated against the json schema before being written.

## Installing the extension locally

Run the following commands to globally install this extension with your local
changes.

```bash
yarn install
yarn build
vsce package
# replace `*` below with the version of the generated vsix file
code --install-extension scala-*.vsix
```
