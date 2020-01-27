// SYNTAX TEST "source.scala"

   s"$first$second"
// ^ keyword.interpolation.scala
//   ^^^^^^^^^^^^^ meta.template.expression.scala
//  ^ punctuation.definition.string.begin.scala
//   ^ punctuation.definition.template-expression.begin.scala
//         ^ punctuation.definition.template-expression.begin.scala
//                ^ punctuation.definition.string.end.scala

   s"$safeTagMarker${mtch.matched}$safeTagMarker"
// ^ keyword.interpolation.scala
//   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ meta.template.expression.scala
//  ^ punctuation.definition.string.begin.scala
//   ^ punctuation.definition.template-expression.begin.scala
//                 ^^ punctuation.definition.template-expression.begin.scala
//                   ^^^^^^^^^^^^ meta.embedded.line.scala
//                               ^ punctuation.definition.template-expression.end.scala
//                                ^ punctuation.definition.template-expression.begin.scala
//                                              ^ punctuation.definition.string.end.scala

   s"${x$}"
// ^ keyword.interpolation.scala
//   ^^^^^ meta.template.expression.scala
//  ^ punctuation.definition.string.begin.scala
//   ^^ punctuation.definition.template-expression.begin.scala
//     ^^ meta.embedded.line.scala
//       ^ punctuation.definition.template-expression.end.scala
//        ^ punctuation.definition.string.end.scala

   val a = 4; foo(a)
// ^^^ keyword.declaration.stable.scala
//     ^ variable.other.declaration.scala
//       ^ keyword.operator.comparison.scala
//         ^ constant.numeric.scala
   s"$safeTagMarker${val a = 4; foo(a)}$safeTagMarker"
//                 ^^^^^^^^^^^^^^^^^^^^ meta.template.expression.scala
//                   ^^^^^^^^^^^^^^^^^ meta.embedded.line.scala
//                   ^^^^^^^^^^^^^^^^^ - punctuation.definition.template-expression
//                   ^^^ keyword.declaration.stable.scala
//                       ^ variable.other.declaration.scala
//                         ^ keyword.operator.comparison.scala
//                           ^ constant.numeric.scala
