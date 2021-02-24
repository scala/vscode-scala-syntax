// SYNTAX TEST "source.scala"


    s"\\"
//  ^ source.scala keyword.interpolation.scala
//   ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//    ^^ constant.character.escape.scala
//      ^ punctuation.definition.string.end.scala

    raw"\\"
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^^ string.quoted.double.interpolated.scala
//      ^^ - constant.character.escape.scala
//        ^ punctuation.definition.string.end.scala

    raw"$$ " // `$$` is an escaped `$` in raw interpolators
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^^ constant.character.escape.scala
//        ^ string.quoted.double.interpolated.scala
//         ^ punctuation.definition.string.end.scala

    raw"$" " // `$"` is an escaped `"` in raw interpolators
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^^ constant.character.escape.scala
//        ^ string.quoted.double.interpolated.scala
//         ^ punctuation.definition.string.end.scala

    raw"${4} "
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^^  meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//        ^ meta.template.expression.scala meta.embedded.line.scala constant.numeric.scala
//         ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala
//          ^ string.quoted.double.interpolated.scala
//           ^ punctuation.definition.string.end.scala


    s"""\\"""
//  ^ source.scala keyword.interpolation.scala
//   ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//      ^^ constant.character.escape.scala
//        ^^^ punctuation.definition.string.end.scala

    raw"""\\"""
//  ^^^ source.scala keyword.interpolation.scala
//     ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//        ^^ string.quoted.triple.interpolated.scala
//        ^^ - constant.character.escape.scala
//          ^^^ punctuation.definition.string.end.scala

    raw"""$$ """
//  ^^^ source.scala keyword.interpolation.scala
//     ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//        ^^ constant.character.escape.scala
//          ^ string.quoted.triple.interpolated.scala
//           ^^^ punctuation.definition.string.end.scala

    raw"""$" """
//  ^^^ source.scala keyword.interpolation.scala
//     ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//        ^^ constant.character.escape.scala
//          ^ string.quoted.triple.interpolated.scala
//           ^^^ punctuation.definition.string.end.scala


    raw"""${4} """
//  ^^^ source.scala keyword.interpolation.scala
//     ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
//        ^^  meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//          ^ meta.template.expression.scala meta.embedded.line.scala constant.numeric.scala
//           ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala
//            ^ string.quoted.triple.interpolated.scala
//             ^^^ punctuation.definition.string.end.scala

    raw"$
//  ^^^ source.scala keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^ - string.quoted.double.interpolated.scala punctuation.definition.string.end.scala
