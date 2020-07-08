// SYNTAX TEST "source.scala"

def f(using x: Int): Unit = ()
//    ^^^^^ keyword.declaration.scala

  f(using 2)
//  ^^^^^ keyword.declaration.scala
//        ^ constant.numeric.scala

  f(using .2)
//  ^^^^^ keyword.declaration.scala
//         ^ constant.numeric.scala

class A(using x: Int)
//      ^^^^^ keyword.declaration.scala

new A(using 3)
//    ^^^^^ keyword.declaration.scala
//          ^ constant.numeric.scala

given [T](using x: Ord[T], using: Int) as Ord[List[T]]
//        ^^^^^ keyword.declaration.scala
//              ^ variable.parameter.scala
//                         ^^^^^ variable.parameter.scala

given [T](using Ord[T]) as Ord[List[T]]
//        ^^^^^ keyword.declaration.scala

  f(using ())
//  ^^^^^ keyword.declaration.scala
//        ^^ meta.parentheses.scala meta.bracket.scala

  f(using {})
//  ^^^^^ keyword.declaration.scala
//        ^ punctuation.section.block.begin.scala
//         ^ punctuation.section.block.end.scala

  f(using ' ')
//  ^^^^^ keyword.declaration.scala
//        ^^^ constant.character.literal.scala

  f(using "")
//  ^^^^^ keyword.declaration.scala
//        ^^ string.quoted.double.scala