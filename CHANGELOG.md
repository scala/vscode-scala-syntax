## Scala Syntax (official) Changelog

### 0.3.8 (2019/10/07 07:40 +00:00)
- [14d22e4](https://github.com/scala/vscode-scala-syntax/commit/14d22e4f897b611266c1ba726473ecc31f0665cb) Revert "Fix #45: Use npx to execute github-changes" (@nicolasstucki)
- [8f1deeb](https://github.com/scala/vscode-scala-syntax/commit/8f1deeb58ed8fa2d64bac7cc9a54d8bfbb14c49d) Update release notes for 0.3.7

### 0.3.7 (2019/10/07 07:20 +00:00)
- [a34b4d4](https://github.com/scala/vscode-scala-syntax/commit/a34b4d4d96c8e8ea4cf729bfac4fe15ab7cb74bb) Fix #62: Do not tag some classes as storage keywords (@nicolasstucki)
- [25af05a](https://github.com/scala/vscode-scala-syntax/commit/25af05af5c5c9ce079dfa9da8af7deb7f7063f02) Fix #51: Support vals with multi-assignment (@nicolasstucki)
- [6aa481b](https://github.com/scala/vscode-scala-syntax/commit/6aa481b435dd0fbb27d1c2e323cc3013d2ba3046) Update release notes for 0.3.6

### 0.3.6 (2019/09/23 11:04 +00:00)
- [a3d8f36](https://github.com/scala/vscode-scala-syntax/commit/a3d8f36947f8d582f451ff56f8637bc7dcbb14bc) Stop illegal char after end of line (@nicolasstucki)
- [aaa8332](https://github.com/scala/vscode-scala-syntax/commit/aaa833286c239c06dce74b33ea2a03efdc60b24f) Fix #45: Use npx to execute github-changes (@nicolasstucki)
- [643cbc3](https://github.com/scala/vscode-scala-syntax/commit/643cbc3156b3ef0ee19ab68345104a6fbc4ff814) Fix #57: Fix handling of scala.quoted opening quotes (@nicolasstucki)
- [666c463](https://github.com/scala/vscode-scala-syntax/commit/666c4637fcbf246154d2d334f247358d8fc7dcac) Fix #55: Add given imports syntax (@nicolasstucki)
- [505de8e](https://github.com/scala/vscode-scala-syntax/commit/505de8eb333f9b4399904067807dadeaded3a5e2) Update release notes for 0.3.5

### 0.3.5 (2019/09/17 13:38 +00:00)
- [d0b9bbd](https://github.com/scala/vscode-scala-syntax/commit/d0b9bbd010a302a4429b8432c50cdcb26515d833) Remove outdated `as` (Dotty syntax) (@nicolasstucki)
- [195db9e](https://github.com/scala/vscode-scala-syntax/commit/195db9e5e0dddc9c771b91e7d1f4770dcc3595ca) Update version to 0.3.5 (@nicolasstucki)
- [71ba0d8](https://github.com/scala/vscode-scala-syntax/commit/71ba0d86b333182edf1c8dd4556b1a7d8a132910) Fix homepage (@nicolasstucki)
- [6525f7d](https://github.com/scala/vscode-scala-syntax/commit/6525f7d949401310d62402a4f8b0978e8c961489) Fix #47: Support `then` keyword and `end` soft keyword (@nicolasstucki)
- [b9b645a](https://github.com/scala/vscode-scala-syntax/commit/b9b645a99469d68ed45a20bb0fec76e17619e3d1) Make `inline`, `opaque`, `as` and `derives` soft keywords (@nicolasstucki)
- [59908f2](https://github.com/scala/vscode-scala-syntax/commit/59908f2b7e17946477995e6b907442e72f45320e) Security updates (@nicolasstucki)
- [294e24e](https://github.com/scala/vscode-scala-syntax/commit/294e24e77b3c1c5910bce938a4b2c3d3d6e3f2c0) Add missing keywords from Dotty 0.17.0-RC1 (@nicolasstucki)
- [f3d587d](https://github.com/scala/vscode-scala-syntax/commit/f3d587d75ac8ca92c006ff72a76c8a4a0158ed76) Update release notes for 0.3.4

### 0.3.4 (2019/06/30 16:26 +00:00)
- [b3bbdf0](https://github.com/scala/vscode-scala-syntax/commit/b3bbdf0e7dfad0cecdf9166ff38ddd4f3bae0143) Fix opening paren matches with closing paren in character literal (@PanAeon)
- [eef0470](https://github.com/scala/vscode-scala-syntax/commit/eef04706197f3c972de087eeaa4cd7536c9b2a99) Fix bug with // inside of a block comment (@PanAeon)
- [6c49b5e](https://github.com/scala/vscode-scala-syntax/commit/6c49b5eb2e3342b785cdec94114e83a73105f6e5) Update release notes for 0.3.3

### 0.3.3 (2019/06/25 12:55 +00:00)
- [f50e487](https://github.com/scala/vscode-scala-syntax/commit/f50e487e8cdce9b41b0d33f8e9949764c08b0e5d) Add top level rule for identifiers inside the backticks (@PanAeon)
- [c84000f](https://github.com/scala/vscode-scala-syntax/commit/c84000fbfa1c70e91011d4aff90c7222fe96d73a) Welcome PanAeon to the team! (@olafurpg)
- [be15605](https://github.com/scala/vscode-scala-syntax/commit/be15605de49de729a0c6760cd17f9184fbb43892) Commiting missing changes (@PanAeon)
- [6fecc7d](https://github.com/scala/vscode-scala-syntax/commit/6fecc7d08d4f79faf904467dd840a4e4e89b4620) Fix nested comments, make links highlighted in the scaladoc, add @constructor keyword, remove dead code, add snap tests for comments. (@PanAeon)
- [0be6724](https://github.com/scala/vscode-scala-syntax/commit/0be6724d87303aeed41f6aa9dac07283cf9b92d4) Fix nested character classes. Remove $schema field. Remove redundant 'special-identifier' rule. (@PanAeon)
- [7affc4e](https://github.com/scala/vscode-scala-syntax/commit/7affc4ed719a3760db745958f83aa744405e1e55) this repo powers highlighting on GitHub (@SethTisue)
- [53610fa](https://github.com/scala/vscode-scala-syntax/commit/53610fa130166351c1c1545798c453a9860e2f0d) Update release notes for v0.3.2

### v0.3.2 (2019/05/28 07:13 +00:00)
- [86f3239](https://github.com/scala/vscode-scala-syntax/commit/86f32392e9b8584bc7afe60d4f9d2fe7df8fc15d) fix #5 broken ids with unicode characters. Updated identifiers regexes for val,def,import,parameter-list,package,type. Minor clean up. Added unit test for unicode (@PanAeon)
- [2d16efe](https://github.com/scala/vscode-scala-syntax/commit/2d16efef91f3d5a8751e9b89b76e4803cea1e163) fix #10 broken single quote symbol. add .metals to .gitignore (@PanAeon)
- [93a7147](https://github.com/scala/vscode-scala-syntax/commit/93a7147f043259e6ea9d4757c9ff25fd0e7fe437) update vscode-tmgrammar-test to 0.0.5.'snap' file format change (@PanAeon)
- [fa35d48](https://github.com/scala/vscode-scala-syntax/commit/fa35d48e1e90ee81071c2ddd44cb0067a33d728b) add test step to travis (@PanAeon)
- [aecb9c3](https://github.com/scala/vscode-scala-syntax/commit/aecb9c3bfe9cf57701ab8370215f69a5af328e25) Add snapshot test with various examples from scala spec (@PanAeon)
- [4bde54b](https://github.com/scala/vscode-scala-syntax/commit/4bde54bc67a42ccff5cc0a94d34108a2623b0c2d) Add vscode-tmgrammar-test module, include tests in ci, add unit and snapshot tests for lexical constructs (@PanAeon)
- [7ff15a6](https://github.com/scala/vscode-scala-syntax/commit/7ff15a6e2053bd55a424fb24b60db32a0dc26fc3) Update release notes for v0.3.1

### v0.3.1 (2019/05/14 09:22 +00:00)
- [6453d96](https://github.com/scala/vscode-scala-syntax/commit/6453d9636fc8558b4e2ac1f933d252853d2fda97) Review fixes, add missing scope to the interpolated string's quotes (@PanAeon)
- [a4fb9a0](https://github.com/scala/vscode-scala-syntax/commit/a4fb9a0c33ca337b0833bbbf40213a9f0a593891) generalize string interpolation to processed strings, i.e. <id>"..." (@PanAeon)
- [e007203](https://github.com/scala/vscode-scala-syntax/commit/e00720354213fe6ad67ae4e5887758c38cbc684d) string interpolation - correct variable name to match sem. meaning, don't mark $vars as vars to be more consistent with the ${var.other} (@PanAeon)
- [925245c](https://github.com/scala/vscode-scala-syntax/commit/925245c1eaeb712987256d2a45398bed6d155749) Add string interpolation highlighting (@PanAeon)
- [5b536a4](https://github.com/scala/vscode-scala-syntax/commit/5b536a4c1e3b46fd0a8dc22ff48c362eb0da0158) Commit auto-generated tmLanguage.json (@olafurpg)
- [d28c383](https://github.com/scala/vscode-scala-syntax/commit/d28c3832d6ddefb2f3e3a931f75f82a87ad761a6) Update release notes for v0.3.0

### v0.3.0 (2019/05/02 13:52 +00:00)
- [c995170](https://github.com/scala/vscode-scala-syntax/commit/c9951706d7032146b7c9ff4d88fe1dde6c244086) Add missing vsce dependency in package.json. (@olafurpg)
- [6246f55](https://github.com/scala/vscode-scala-syntax/commit/6246f550409b2e249a879accac49c878453e4d2c) Update release notes for v0.3.0
- [27b8cd5](https://github.com/scala/vscode-scala-syntax/commit/27b8cd570be9bcae775ca1b49cad8fc945b59fd1) Add missing vscode:publish command from package.json. (@olafurpg)
- [25c62bc](https://github.com/scala/vscode-scala-syntax/commit/25c62bccd70ee4cd077236e87d89646debd82515) Update release notes for v0.3.0
- [ba65f13](https://github.com/scala/vscode-scala-syntax/commit/ba65f1317dc728e3f5203bf78dadad67b6aa2734) Use SSH remote instead of HTTPS. (@olafurpg)
- [0546974](https://github.com/scala/vscode-scala-syntax/commit/0546974ba16b0b828dfa095aaed7d1a70331563e) Make ci-release.sh script executable (@olafurpg)
- [f302051](https://github.com/scala/vscode-scala-syntax/commit/f3020516ecaa80dbb9b74350ed01302c619165c6) Replace links from Metals to Scala Syntax (@olafurpg)
- [bc2fa54](https://github.com/scala/vscode-scala-syntax/commit/bc2fa542f39592cc6b204738b3bbe4e08ccfaaf2) Replace npx with ts-node for faster build script. (@olafurpg)
- [869e06b](https://github.com/scala/vscode-scala-syntax/commit/869e06bbfab7534758db59f41b5c978f523a3d75) Configure CI to release on tag push. (@olafurpg)
- [f554622](https://github.com/scala/vscode-scala-syntax/commit/f554622a468ee49316f509c3a6c7801c6f28fc8b) Remove snippet package, fixes #18 (@olafurpg)
- [c9a4a36](https://github.com/scala/vscode-scala-syntax/commit/c9a4a36253af5dd78dfecfa19c81fcac3f023674) Add pre-package check. Add proper build script. Updated .vscodeignore. Updated README. (@PanAeon)
- [f3aca62](https://github.com/scala/vscode-scala-syntax/commit/f3aca62801a0c3fa3faa24c30ad01bd9783e5634) Convert syntax file to Typescript, add utils to work with ts file, update docs (@PanAeon)
- [ebe1ad0](https://github.com/scala/vscode-scala-syntax/commit/ebe1ad0d9a6a2535aa3d1049c820a250d697da39) Add auto-closing pair for string interpolation (@hugo-vrijswijk)
- [2e5e24a](https://github.com/scala/vscode-scala-syntax/commit/2e5e24a61be430abf11eb4e3a4a5a65b7b8edd64) Fix case class/object highlighting (@Hydrotoast)
- [4ad7830](https://github.com/scala/vscode-scala-syntax/commit/4ad7830d41cd172ac2ef5a10a422fab8b8942230) Update publish info (@nicolasstucki)
- [71fc3fd](https://github.com/scala/vscode-scala-syntax/commit/71fc3fdd3bdcb93e9ebb856845f1e391df070153) Add scala syntax as snippet requirement (@gabro)
- [d275c5f](https://github.com/scala/vscode-scala-syntax/commit/d275c5f824c2184d1c52cd0bc0679f5d2788bfef) Split syntax and snippets (@gabro)
- [78ebbbe](https://github.com/scala/vscode-scala-syntax/commit/78ebbbe72f9f054ea7f6cb6d08100e90bd7c93ce) Enable extension on `.sc` files (@Duhemm)
- [19a2051](https://github.com/scala/vscode-scala-syntax/commit/19a2051e58d88b9bf320b9343746d547f8b9648a) Publish as scala-lang (@nicolasstucki)
- [829b8eb](https://github.com/scala/vscode-scala-syntax/commit/829b8ebbce658271d0421f58e9ee9f23e8f52a8a) Update version (@nicolasstucki)
- [aef901c](https://github.com/scala/vscode-scala-syntax/commit/aef901c015c994982294b511c6a83638edebfcfe) Update syntax (@nicolasstucki)
- [a68e1ad](https://github.com/scala/vscode-scala-syntax/commit/a68e1ad10be00f648eaa86b789884a358c30f3ab) Update version (@nicolasstucki)
- [e53ddad](https://github.com/scala/vscode-scala-syntax/commit/e53ddad3fa57e26516713d55937871e0b5af0afc) Add snippets (@nicolasstucki)
- [64aa83c](https://github.com/scala/vscode-scala-syntax/commit/64aa83c48622a50208ca4a3eeadec6b636469c36) Add references (@nicolasstucki)
- [49ec358](https://github.com/scala/vscode-scala-syntax/commit/49ec3584a2658209c24fa74a9da19d26a7b833ed) Update to 0.1.3 (@nicolasstucki)
- [ea80cb7](https://github.com/scala/vscode-scala-syntax/commit/ea80cb74ed611eed3b206316c5946f5ef9259904) Add some keywords (@nicolasstucki)
- [fa7fea7](https://github.com/scala/vscode-scala-syntax/commit/fa7fea79764cd295cbc25005bd5decbe954c9a59) Remove some snippets to keep options simple (@nicolasstucki)
- [27a8e69](https://github.com/scala/vscode-scala-syntax/commit/27a8e6939df0655e8e8f6ac99f1ce68efd549080) Update to 0.1.2 (@nicolasstucki)
- [63e4585](https://github.com/scala/vscode-scala-syntax/commit/63e45856f0f2a78f87813235cfa4e12d18a08bce) Add some basic code snippets (@nicolasstucki)
- [3ff361f](https://github.com/scala/vscode-scala-syntax/commit/3ff361f2cbb91fdca1ed90ff0928e67c1ab12b67) Update version to 0.1.1 (@nicolasstucki)
- [4821223](https://github.com/scala/vscode-scala-syntax/commit/48212238d9891908a0b0e5461e5acc6d53db3d4d) Fix closing brackets not being identified (@nicolasstucki)
- [b1d10d6](https://github.com/scala/vscode-scala-syntax/commit/b1d10d6267abe21fd8423411323b903ce5b74ff1) Add debbug launcher (@nicolasstucki)
- [a19c6c4](https://github.com/scala/vscode-scala-syntax/commit/a19c6c4b8b27f39276b1eef8c7ee2185e60d987e) Update version and publisher (@nicolasstucki)
- [1d9c36e](https://github.com/scala/vscode-scala-syntax/commit/1d9c36e747d3103930112895887f888bb189e8d2) Fix #1: Publish in market place (@nicolasstucki)
- [a95cf09](https://github.com/scala/vscode-scala-syntax/commit/a95cf090518e50db7c825c5baa1247afd6909383) Remove old ported comments (@nicolasstucki)
- [db11ec3](https://github.com/scala/vscode-scala-syntax/commit/db11ec3eb423751bd253dc6cac3dcd7adf61a410) Fix expression and type quotes (@nicolasstucki)
- [5518b86](https://github.com/scala/vscode-scala-syntax/commit/5518b86e30bf6e39dc60fb33950e7d74995115a3) Initial commit (@nicolasstucki)