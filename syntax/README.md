# Scala Syntax

[VS Code plugin](https://marketplace.visualstudio.com/items?itemName=scala-lang.scala)

## Features

Extension providing Scala syntax.

## Requirements

No requirements.

## Development

The source language file is located at `src/typescript/Scala.tmlanguage.ts`. The output tmLanguage file `syntaxes/Scala.tmLanguage.json` is marked as ignored in git and shouldn't be commited.

To generate the ouput file either use build command or run:

```bash
npm install
npm build
npx ts-node src/typescript/GenerateTmLanguageFile.ts > ./syntaxes/Scala.tmLanguage.json
```

The output file is validated against the json schema before being written.


## Based on
* Plugin: https://github.com/daltonjorge/vscode-scala
* Template: https://github.com/sellmerfud/scala.tmbundle (https://github.com/mads-hartmann/scala.tmbundle)
* Textmate json schema: https://github.com/Septh/tmlanguage/blob/master/tmLanguage.schema.json

## License
[MIT](LICENSE)

-----------------------------------------------------------------------------------------------------------
