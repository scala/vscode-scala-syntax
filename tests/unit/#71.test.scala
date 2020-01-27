// SYNTAX TEST "source.scala"

   s"1 + 2 = ${ 1 + { val x = 2; x } }."
// ^ keyword.interpolation.scala
//           ^^^^^^^^^^^^^^^^^^^^^^^^^ meta.template.expression.scala
//  ^ punctuation.definition.string.begin.scala
//   ^^^^^^^^ string.quoted.double.interpolated.scala
//           ^^ punctuation.definition.template-expression.begin.scala
//                  ^ punctuation.section.block.begin.scala
//                                 ^ punctuation.section.block.end.scala
//             ^^^^^^^^^^^^^^^^^^^^^^ meta.embedded.line.scala
//                                   ^ punctuation.definition.template-expression.end.scala
//                                    ^ string.quoted.double.interpolated.scala
//                                     ^ punctuation.definition.string.end.scala

   s"""1 + 2 = ${
// ^ keyword.interpolation.scala
//  ^^^ punctuation.definition.string.begin.scala
//     ^^^^^^^^ string.quoted.triple.interpolated.scala
//             ^^ meta.template.expression.scala punctuation.definition.template-expression.begin.scala
     def add(x: Int, y: Int) = {
//   ^^^^^^^^^^^^^^^^^^^^^^^^^^^ meta.template.expression.scala meta.embedded.line.scala
//                             ^ punctuation.section.block.begin.scala
       x + y
//     ^^^^^ meta.template.expression.scala meta.embedded.line.scala
     }
//   ^ meta.template.expression.scala meta.embedded.line.scala punctuation.section.block.end.scala
     add(1, 2)
//   ^^^^^^^^^ meta.template.expression.scala meta.embedded.line.scala
   }."""
// ^ meta.template.expression.scala punctuation.definition.template-expression.end.scala
//  ^ string.quoted.triple.interpolated.scala
//   ^^^ punctuation.definition.string.end.scala
