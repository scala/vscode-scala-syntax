// SYNTAX TEST "source.scala"

   test"hello $name"
// ^^^^ keyword.interpolation.scala
//     ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//      ^^^^^^ string.quoted.double.interpolated.scala
//            ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//             ^^^^ meta.template.expression.scala
//                 ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   test1"hello $name"
// ^^^^^ keyword.interpolation.scala
//      ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//       ^^^^^^ string.quoted.double.interpolated.scala
//             ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//              ^^^^ meta.template.expression.scala
//                  ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   test1a"hello $name"
// ^^^^^^ keyword.interpolation.scala
//       ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//        ^^^^^^ string.quoted.double.interpolated.scala
//              ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//               ^^^^ meta.template.expression.scala
//                   ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala

   test_+"hello $name"
// ^^^^^^ keyword.interpolation.scala
//       ^ string.quoted.double.interpolated.scala punctuation.definition.string.begin.scala
//        ^^^^^^ string.quoted.double.interpolated.scala
//              ^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
//               ^^^^ meta.template.expression.scala
//                   ^ string.quoted.double.interpolated.scala punctuation.definition.string.end.scala
