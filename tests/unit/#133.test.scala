// SYNTAX TEST "source.scala"


    inline val c = 0
//  ^^^^^^ storage.modifier.other

    inline def power(x: Double, inline n: Int): Double =
//  ^^^^^^ storage.modifier.other
//                              ^^^^^^ storage.modifier.other
      inline if (n == 0) 1.0
//    ^^^^^^ keyword.control.flow.scala
      else inline if (n % 2 == 1) x * power(x, n - 1)
//         ^^^^^^ keyword.control.flow.scala
      else power(x * x, n / 2)
 

    inline x match {
//  ^^^^^^ keyword.control.flow.scala
//           ^^^^^ keyword.control.flow.scala


    inline def power(x: Double, inline N: Int): Double =
//  ^^^^^^ storage.modifier.other
//                              ^^^^^^ storage.modifier.other

    inline def power(x: Double, inline `n`: Int): Double =
//  ^^^^^^ storage.modifier.other
//                              ^^^^^^ storage.modifier.other

val x = inline + 2
//      ^^^^^^ - storage.modifier.other keyword.control.flow.scala
val x = inline(x)
//      ^^^^^^ - storage.modifier.other keyword.control.flow.scala
val x = inline[T]
//      ^^^^^^ - storage.modifier.other keyword.control.flow.scala

    inline def inline(inline inline: Int): Double =
//  ^^^^^^ storage.modifier.other
//             ^^^^^^ entity.name.function.declaration
//                    ^^^^^^ storage.modifier.other
//                           ^^^^^^ variable.parameter.scala
