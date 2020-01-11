// SYNTAX TEST "source.scala"

   s"1 + 2 = ${ 1 + { val x = 2; x } }."
// ^ keyword.interpolation.scala
//  ^ punctuation.definition.string.begin.scala
//   ^^^^^^^^ string.quoted.double.interpolated.scala
//           ^^ punctuation.definition.template-expression.begin.scala
//                  ^ punctuation.section.block.begin.scala
//                                 ^ punctuation.section.block.end.scala
//             ^^^^^^^^^^^^^^^^^^^^^^ punctuation.definition.template-expression.scala
//                                   ^ punctuation.definition.template-expression.end.scala
//                                    ^ string.quoted.double.interpolated.scala
//                                     ^ punctuation.definition.string.end.scala

   s"""1 + 2 = ${
// ^ keyword.interpolation.scala
//  ^^^ punctuation.definition.string.begin.scala
//     ^^^^^^^^ string.quoted.triple.interpolated.scala
//             ^^ punctuation.definition.template-expression.begin.scala
     def add(x: Int, y: Int) = {
//   ^^^^^^^^^^^^^^^^^^^^^^^^^^^ punctuation.definition.template-expression.scala
//                             ^ punctuation.section.block.begin.scala
       x + y
//     ^^^^^ punctuation.definition.template-expression.scala
     }
//   ^ punctuation.section.block.end.scala
//   ^ punctuation.definition.template-expression.scala
     add(1, 2)
//   ^^^^^^^^^ punctuation.definition.template-expression.scala
   }."""
// ^ punctuation.definition.template-expression.end.scala
//  ^ string.quoted.triple.interpolated.scala
//   ^^^ punctuation.definition.string.end.scala
