// SYNTAX TEST "source.scala"

  "abc" match
    case x"${x}b$y" =>
//       ^ keyword.interpolation.scala
//          ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//            ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala

  val x"${x}b$y" = "abc"
//    ^ keyword.interpolation.scala
//       ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//         ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala

  var x"${x}b$y" = "abc"
//    ^ keyword.interpolation.scala
//       ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//         ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala

  val (x"${x}b$y", _) = "abc"
//     ^ keyword.interpolation.scala
//        ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//          ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala
