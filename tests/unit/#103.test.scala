// SYNTAX TEST "source.scala"

// THIS FILE CONTAINS OUTDATED GIVEN SYNTAX

    given as Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^ - keyword.declaration.scala

    given foo as Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.given.declaration
//            ^^ - keyword.declaration.scala

    given (x: X) as Foo = ...
//  ^^^^^ keyword.declaration.scala
//         ^ variable.parameter.scala
//          ^ meta.colon.scala
//            ^ entity.name.class
//               ^^ - keyword.declaration.scala

    given [X](x: X) as Foo = ...
//  ^^^^^ keyword.declaration.scala
//         ^ entity.name.class
//            ^ variable.parameter.scala
//             ^ meta.colon.scala
//               ^ entity.name.class
//                  ^^ - keyword.declaration.scala

    given foo(x: A) as Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.given.declaration
//            ^ variable.parameter.scala
//             ^ meta.colon.scala
//               ^ entity.name.class
//                  ^^ - keyword.declaration.scala

    given foo[X](x: X) as Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.given.declaration
//            ^ entity.name.class
//               ^ variable.parameter.scala
//                ^ meta.colon.scala
//                  ^ entity.name.class
//                     ^^ - keyword.declaration.scala

    given foo[X <: Y { type A = 1; def f(using a: Int): 2 }](x: X = 2) as Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.given.declaration
//                     ^^^^ keyword.declaration.scala
//                              ^ constant.numeric.scala
//                                 ^^^ keyword.declaration.scala
//                                     ^ entity.name.function.declaration
//                                       ^^^^^ keyword.declaration.scala
//                                             ^ variable.parameter.scala
//                                              ^ meta.colon.scala
//                                                ^^^ entity.name.class
//                                                      ^ constant.numeric.scala
//                                                                  ^ constant.numeric.scala

    given (using x: X = "abs")(using y: Y = s"y: $x", y: Char = if true then 'a' else 2) as Foo = ...
//  ^^^^^ keyword.declaration.scala
//                      ^^^^^ string.quoted.double.scala
//                                          ^ keyword.interpolation.scala
//                                           ^^^^ string.quoted.double.interpolated.scala
//                                               ^^ meta.template.expression.scala
//                                                              ^^ keyword.control.flow.scala
//                                                                 ^^^^ constant.language.scala
//                                                                      ^^^^ keyword.control.flow.scala
//                                                                           ^^^ constant.character.literal.scala
//                                                                               ^^^^ keyword.control.flow.scala
//                                                                                    ^ constant.numeric.scala

    given // this should be a comment
//  ^^^^^ keyword.declaration.scala
//        ^^ punctuation.definition.comment.scala
//          ^^^^^^^^^^^^^^^^^^^^^^^^^ comment.line.double-slash.scala
        as Foo
//      ^^ - keyword.declaration.scala

    given// this should be a comment
//  ^^^^^ keyword.declaration.scala
//       ^^ punctuation.definition.comment.scala
//          ^^^^^^^^^^^^^^^^^^^^^^^^ comment.line.double-slash.scala

    given /* this should be a comment */
//  ^^^^^ keyword.declaration.scala
//        ^^ punctuation.definition.comment.scala
//          ^^^^^^^^^^^^^^^^^^^^^^^^^^ comment.block.scala
//                                    ^^ punctuation.definition.comment.scala
