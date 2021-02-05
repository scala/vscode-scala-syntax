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


   s"$
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^ - string.quoted.double.interpolated.scala punctuation.definition.string.end.scala
//   ^ - constant.character.escape.scala


   s"$ //
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^^ invalid.illegal.unrecognized-string-escape.scala

   s"$++
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^^ invalid.illegal.unrecognized-string-escape.scala
//     ^ keyword.operator.arithmetic.scala

   s"$; val a =
//  ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//   ^^ invalid.illegal.unrecognized-string-escape.scala
//      ^^^^^^^^ -string.quoted.double.interpolated.scala
//      ^^^ keyword.declaration.stable.scala

    raw"$
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^ - string.quoted.double.interpolated.scala invalid.illegal.unrecognized-string-escape.scala

    raw"$4
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^^ invalid.illegal.unrecognized-string-escape.scala

    raw"""$
//  ^^^ source.scala keyword.interpolation.scala
//     ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//        ^ - string.quoted.triple.interpolated.scala invalid.illegal.unrecognized-string-escape.scala

    raw"""$8
//  ^^^ source.scala keyword.interpolation.scala
//     ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//        ^^ invalid.illegal.unrecognized-string-escape.scala

    s"""$
//  ^ source.scala keyword.interpolation.scala
//   ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//      ^ - string.quoted.triple.interpolated.scala invalid.illegal.unrecognized-string-escape.scala

    s"""$8
//  ^ source.scala keyword.interpolation.scala
//   ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//      ^^ invalid.illegal.unrecognized-string-escape.scala
