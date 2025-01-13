// SYNTAX TEST "source.scala"

   def fromInt[T: Numeric as num](t: Int): T = num.fromInt(t)
// ^^^ keyword.declaration.scala
//     ^^^^^^^ source.scala entity.name.function.declaration
//            ^ source.scala meta.bracket.scala
//             ^ source.scala entity.name.class
//              ^ source.scala keyword.operator.scala
//               ^ source.scala
//                ^^^^^^^ source.scala entity.name.class
//                        ^^ keyword.other.import.as.scala
//                           ^^^ variable.stable.declaration.scala
//                              ^ source.scala meta.bracket.scala
//                               ^ source.scala meta.bracket.scala
//                                ^ source.scala variable.parameter.scala
//                                 ^ source.scala meta.colon.scala
//                                  ^ source.scala
//                                   ^^^ source.scala entity.name.class
//                                      ^ source.scala meta.bracket.scala
//                                       ^ source.scala keyword.operator.scala
//                                        ^ source.scala
//                                         ^ source.scala entity.name.class
//                                          ^ source.scala
//                                           ^ source.scala keyword.operator.comparison.scala
//                                            ^^^^^^^^^^^^ source.scala
//                                                        ^ source.scala meta.bracket.scala
//                                                         ^ source.scala
//                                                          ^ source.scala meta.bracket.scala
