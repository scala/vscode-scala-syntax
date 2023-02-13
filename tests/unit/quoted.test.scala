// SYNTAX TEST "source.scala"

   'x
// ^ keyword.control.flow.staging.scala constant.other.symbol.scala
//  ^ constant.other.symbol.scala
   '{ 2 }
// ^ keyword.control.flow.staging.scala
//  ^ punctuation.section.block.begin.scala
//    ^ constant.numeric.scala
//      ^ punctuation.section.block.end.scala

   ' 	{ 2 }
// ^ keyword.control.flow.staging.scala
//    ^ punctuation.section.block.begin.scala
//      ^ constant.numeric.scala
//        ^ punctuation.section.block.end.scala

   '
// ^ punctuation.definition.character.begin.scala
 	{ }

   '[ String ]
// ^ keyword.control.flow.staging.scala
//  ^ meta.bracket.scala
//    ^^^^^^ entity.name.class
//           ^ meta.bracket.scala

   ' [ String ]
// ^ keyword.control.flow.staging.scala
//   ^ meta.bracket.scala
//     ^^^^^^ entity.name.class
//            ^ meta.bracket.scala

   ${ 1 }
// ^ keyword.control.flow.staging.scala
//  ^ punctuation.section.block.begin.scala
//    ^ constant.numeric.scala
//      ^ punctuation.section.block.end.scala

   case '{ x } =>
// ^^^^ keyword.control.flow.scala
//      ^ keyword.control.flow.staging.scala
//       ^ punctuation.section.block.begin.scala
//           ^ punctuation.section.block.end.scala

   case '[ T ] =>
// ^^^^ keyword.control.flow.scala
//      ^ keyword.control.flow.staging.scala
//       ^ meta.bracket.scala
//           ^ meta.bracket.scala
