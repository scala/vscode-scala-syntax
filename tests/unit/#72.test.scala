// SYNTAX TEST "source.scala"

   s"$first$second"
// ^ keyword.interpolation.scala
//  ^ punctuation.definition.string.begin.scala
//   ^ punctuation.definition.template-expression.begin.scala
//         ^ punctuation.definition.template-expression.begin.scala
//                ^ punctuation.definition.string.end.scala

   s"$safeTagMarker${mtch.matched}$safeTagMarker"
// ^ keyword.interpolation.scala
//  ^ punctuation.definition.string.begin.scala
//   ^ punctuation.definition.template-expression.begin.scala
//                 ^^ punctuation.definition.template-expression.begin.scala
//                   ^^^^^^^^^^^^ punctuation.definition.template-expression.scala
//                               ^ punctuation.definition.template-expression.end.scala
//                                ^ punctuation.definition.template-expression.begin.scala
//                                              ^ punctuation.definition.string.end.scala

   s"${x$}"
// ^ keyword.interpolation.scala
//  ^ punctuation.definition.string.begin.scala
//   ^^ punctuation.definition.template-expression.begin.scala
//     ^^ punctuation.definition.template-expression.scala
//       ^ punctuation.definition.template-expression.end.scala
//        ^ punctuation.definition.string.end.scala
