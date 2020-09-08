// SYNTAX TEST "source.scala"

    class Foo extends scala.collection.Seq[Int]
//  ^^^^^  keyword.declaration.scala
//        ^^^  entity.name.class.declaration
//            ^^^^^^^  keyword.declaration.scala
//                    ^^^^^  source.scala
//                          ^^^^^^^^^^  source.scala
//                                     ^^^  entity.name.class
//                                        ^  meta.bracket.scala
//                                         ^^^  entity.name.class
//                                            ^  meta.bracket.scala
