// SYNTAX TEST "source.scala"

   210
// ^^^ constant.numeric.scala
   0b1
// ^^^ constant.numeric.scala
   0B1
// ^^^ constant.numeric.scala
   0b0001
// ^^^ constant.numeric.scala
   0b0001_0000_0000
// ^^^^^^^^^^^^^^^^ constant.numeric.scala


   0b1L + 0B10L + 0b11l + 0B100l
// ^^^ constant.numeric.scala
//        ^^^^^ constant.numeric.scala
//                ^^^^^ constant.numeric.scala
//                        ^^^^^^ constant.numeric.scala

   0b0010_1001_0101_1001__1010_0100_1000_1010__1001_1000_0011_0111__1100_1011_0111_0101L
// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ constant.numeric.scala
