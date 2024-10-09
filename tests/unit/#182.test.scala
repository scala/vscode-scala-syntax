// SYNTAX TEST "source.scala"

   true&&false
// ^^^^ constant.language.scala
//     ^^ keyword.operator.logical.scala
//       ^^^^^ constant.language.scala
   b&&false
//  ^^ keyword.operator.logical.scala
//    ^^^^^ constant.language.scala

  b&&b
// ^^ keyword.operator.logical.scala
  b||b
// ^^ keyword.operator.logical.scala
   !b
// ^ keyword.operator.logical.scala

  b&&&b
// ^^^ - keyword.operator.logical.scala
  b&&?b
// ^^^ - keyword.operator.logical.scala
  b&&!b
// ^^^ - keyword.operator.logical.scala
  b!&&b
// ^^^ - keyword.operator.logical.scala
  b&&+b
// ^^^ - keyword.operator.logical.scala
  b&&^b
// ^^^ - keyword.operator.logical.scala
  b&&~b
// ^^^ - keyword.operator.logical.scala
  b&&#b
// ^^^ - keyword.operator.logical.scala
  b&&%b
// ^^^ - keyword.operator.logical.scala
  b&&@b
// ^^^ - keyword.operator.logical.scala
  b@&&b
// ^^^ - keyword.operator.logical.scala
