// SYNTAX TEST "source.scala"

   def // comment
// ^^^ keyword.declaration.scala
//     ^^^^^^^^^^ comment.line.double-slash.scala

   def /* comment */
// ^^^ keyword.declaration.scala
//     ^^^^^^^^^^^^^ comment.block.scala

   val // comment
// ^^^ keyword.declaration.stable.scala
//     ^^^^^^^^^^ comment.line.double-slash.scala

   val /* comment */
// ^^^ keyword.declaration.stable.scala
//     ^^^^^^^^^^^^^ comment.block.scala

   var // comment
// ^^^ keyword.declaration.volatile.scala
//     ^^^^^^^^^^ comment.line.double-slash.scala

   var /* comment */
// ^^^ keyword.declaration.volatile.scala
//     ^^^^^^^^^^^^^ comment.block.scala

   given // comment
// ^^^^^ keyword.declaration.scala
//       ^^^^^^^^^^ comment.line.double-slash.scala

   given /* comment */
// ^^^^^ keyword.declaration.scala
//       ^^^^^^^^^^^^^ comment.block.scala

   class // comment
// ^^^^^ keyword.declaration.scala
//       ^^^^^^^^^^ comment.line.double-slash.scala

   class /* comment */
// ^^^^^ keyword.declaration.scala
//       ^^^^^^^^^^^^^ comment.block.scala

   trait // comment
// ^^^^^ keyword.declaration.scala
//       ^^^^^^^^^^ comment.line.double-slash.scala

   trait /* comment */
// ^^^^^ keyword.declaration.scala
//       ^^^^^^^^^^^^^ comment.block.scala

   object // comment
// ^^^^^^ keyword.declaration.scala
//        ^^^^^^^^^^ comment.line.double-slash.scala

   object /* comment */
// ^^^^^^ keyword.declaration.scala
//        ^^^^^^^^^^^^^ comment.block.scala

   enum // comment
// ^^^^ keyword.declaration.scala
//      ^^^^^^^^^^ comment.line.double-slash.scala

   enum /* comment */
// ^^^^ keyword.declaration.scala
//      ^^^^^^^^^^^^^ comment.block.scala

   type // comment
// ^^^^ keyword.declaration.scala
//      ^^^^^^^^^^ comment.line.double-slash.scala

   type /* comment */
// ^^^^ keyword.declaration.scala
//      ^^^^^^^^^^^^^ comment.block.scala