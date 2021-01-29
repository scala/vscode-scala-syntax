// SYNTAX TEST "source.scala"

   s"$a"
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//    ^ meta.template.expression.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   s"${a}"
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//     ^ meta.template.expression.scala
//      ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala
//       ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   s"$_"
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^ source.scala meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//    ^ source.scala meta.template.expression.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   s"$$"
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^^ constant.character.escape.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   s"$""
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^^ constant.character.escape.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala


   s"$ //
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala
//     ^^ comment.line.double-slash.scala punctuation.definition.comment.scala

   s"$+
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala
//    ^ keyword.operator.arithmetic.scala

   s"$; val a =
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala
//    ^^^^^^^^^^ -string.quoted.double.interpolated.scala
//      ^^^ keyword.declaration.stable.scala
