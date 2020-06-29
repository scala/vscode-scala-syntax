// SYNTAX TEST "source.scala"

   1 2l 2L 3f 3F 4d 4D 5.6 2.3e56 2.3E56
// ^ constant.numeric.scala
//   ^^ constant.numeric.scala
//      ^^ constant.numeric.scala
//         ^^ constant.numeric.scala
//            ^^ constant.numeric.scala
//               ^^ constant.numeric.scala
//                  ^^ constant.numeric.scala
//                     ^^^ constant.numeric.scala
//                         ^^^^^^ constant.numeric.scala
//                                ^^^^^^ constant.numeric.scala
   
   -1
// ^ keyword.operator.arithmetic.scala
//  ^ constant.numeric.scala

   0x123abc
// ^^^^^^^^^ constant.numeric.scala

   123_456
// ^^^^^^^ constant.numeric.scala

   0x123_abc
// ^^^^^^^^^ constant.numeric.scala

   110_222_795_799.99
// ^^^^^^^^^^^^^^^^^^ constant.numeric.scala

   110.9499_999
// ^^^^^^^^^^^ constant.numeric.scala

   2_000.343_999e561_100
// ^^^^^^^^^^^^^^^^^^^^^ constant.numeric.scala

   .123_456
//  ^^^^^^^ constant.numeric.scala
