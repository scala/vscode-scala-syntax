var cp = require('child_process')

try {
cp.execSync("npx vscode-tmgrammar-test -s source.scala -g syntaxes/Scala.tmLanguage.json -t 'tests/unit/**/*.test.scala'",
  { stdio: 'inherit' })
} catch(err) {
    console.debug(err.toString())
    process.exit(-1)
}