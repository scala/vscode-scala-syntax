// SYNTAX TEST "source.scala"

    def showMax[X : {Ordering, Show}](x: X, y: X): String
//  ^^^ source.scala keyword.declaration.scala
//      ^^^^^^^ source.scala entity.name.function.declaration
//             ^ source.scala meta.bracket.scala
//              ^ source.scala entity.name.class
//                ^ source.scala keyword.operator.scala
//                 ^ source.scala
//                  ^ source.scala punctuation.section.block.begin.scala
//                   ^^^^^^^^ source.scala entity.name.class
//                             ^^^^ source.scala entity.name.class
//                                 ^ source.scala punctuation.section.block.end.scala
//                                  ^ source.scala meta.bracket.scala
//                                   ^ source.scala meta.bracket.scala
//                                    ^ source.scala variable.parameter.scala
//                                     ^ source.scala meta.colon.scala
//                                       ^ source.scala entity.name.class
//                                          ^ source.scala variable.parameter.scala
//                                           ^ source.scala meta.colon.scala
//                                             ^ source.scala entity.name.class
//                                              ^ source.scala meta.bracket.scala
//                                               ^ source.scala keyword.operator.scala
//                                                 ^^^^^^ source.scala entity.name.class

>   def showMax[X : {Ordering as ordering, Show as show}](x: X, y: X): String
//  ^^^ source.scala keyword.declaration.scala
//      ^^^^^^^ source.scala entity.name.function.declaration
//             ^ source.scala meta.bracket.scala
//              ^ source.scala entity.name.class
//               ^ source.scala
//                ^ source.scala keyword.operator.scala
//                  ^ source.scala punctuation.section.block.begin.scala
//                   ^^^^^^^^ source.scala entity.name.class
//                            ^^ source.scala keyword.other.import.as.scala
//                               ^^^^^^^^ source.scala variable.stable.declaration.scala
//                                         ^^^^ source.scala entity.name.class
//                                              ^^ source.scala keyword.other.import.as.scala
//                                                 ^^^^ source.scala variable.stable.declaration.scala
//                                                     ^ source.scala punctuation.section.block.end.scala
//                                                      ^ source.scala meta.bracket.scala
//                                                       ^ source.scala meta.bracket.scala
//                                                        ^ source.scala variable.parameter.scala
//                                                         ^ source.scala meta.colon.scala
//                                                           ^ source.scala entity.name.class
//                                                              ^ source.scala variable.parameter.scala
//                                                               ^ source.scala meta.colon.scala
//                                                                 ^ source.scala entity.name.class
//                                                                  ^ source.scala meta.bracket.scala
//                                                                   ^ source.scala keyword.operator.scala
//                                                                     ^^^^^^ source.scala entity.name.class
