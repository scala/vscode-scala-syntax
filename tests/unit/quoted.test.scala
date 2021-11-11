// SYNTAX TEST "source.scala"

   '{ 2 }
// ^^ punctuation.section.block.begin.scala
//    ^ constant.numeric.scala
//      ^ punctuation.section.block.end.scala

   ' 	{ 2 }
// ^^^^ punctuation.section.block.begin.scala
//      ^ constant.numeric.scala
//        ^ punctuation.section.block.end.scala

   '[ String ]
// ^^ meta.bracket.scala
//    ^^^^^^ entity.name.class
//           ^ meta.bracket.scala

   ' [ String ]
// ^^^ meta.bracket.scala
//     ^^^^^^ entity.name.class
//            ^ meta.bracket.scala


   ${ 1 }
// ^^ punctuation.section.block.begin.scala
//    ^ constant.numeric.scala
//      ^ punctuation.section.block.end.scala

   case '{ x } =>
// ^^^^ keyword.control.flow.scala
//      ^^ punctuation.section.block.begin.scala
//           ^ punctuation.section.block.end.scala

   case '[ T ] =>
// ^^^^ keyword.control.flow.scala
//      ^^ meta.bracket.scala
//           ^ meta.bracket.scala
