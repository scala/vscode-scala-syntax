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

    inline xval match {
//  ^^^^^^ keyword.control.flow.scala
//              ^^^^^ keyword.control.flow.scala

    inline val1 match {
//  ^^^^^^ keyword.control.flow.scala
//              ^^^^^ keyword.control.flow.scala

    inline def1 match {
//  ^^^^^^ keyword.control.flow.scala
//              ^^^^^ keyword.control.flow.scala

    inline given1 match {
//  ^^^^^^ keyword.control.flow.scala
//                ^^^^^ keyword.control.flow.scala

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

    inline def inline(inline xif: Int, inline ifx: Int): Double =
//  ^^^^^^ storage.modifier.other
//             ^^^^^^ entity.name.function.declaration
//                    ^^^^^^ storage.modifier.other
//                           ^^^ variable.parameter.scala
//                                     ^^^^^^ storage.modifier.other
//                                            ^^^ variable.parameter.scala

    inline def inline(inline xmatch: Int, inline matchx: Int): Double =
//  ^^^^^^ storage.modifier.other
//             ^^^^^^ entity.name.function.declaration
//                    ^^^^^^ storage.modifier.other
//                           ^^^^^^ variable.parameter.scala
//                                        ^^^^^^ storage.modifier.other
//                                               ^^^^^^ variable.parameter.scala

   inline if (n == 0) 1 else 2; val x = 2
// ^^^^^^ keyword.control.flow.scala
//        ^^ keyword.control.flow.scala

   inline if (n == 0) 1 else 2; def x = 2
// ^^^^^^ keyword.control.flow.scala
//        ^^ keyword.control.flow.scala

    inline f[X](x: X) match {
//  ^^^^^^ keyword.control.flow.scala
//                    ^^^^^ keyword.control.flow.scala

    inline xval
//  ^^^^^^ - storage.modifier.other keyword.control.flow.scala

    inline valx
//  ^^^^^^ - storage.modifier.other keyword.control.flow.scala

    inline defx
//  ^^^^^^ - storage.modifier.other keyword.control.flow.scala

    inline xdef
//  ^^^^^^ - storage.modifier.other keyword.control.flow.scala

    inline givenx
//  ^^^^^^ - storage.modifier.other keyword.control.flow.scala

    inline xgiven
//  ^^^^^^ - storage.modifier.other keyword.control.flow.scala