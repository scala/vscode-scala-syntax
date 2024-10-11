// SYNTAX TEST "source.scala"

  seq:+element
//   ^^ keyword.operator.scala
  setting := value
//        ^^ keyword.operator.scala

   a->b
//  ^^ keyword.operator.scala
   a->>b
//  ^^^ keyword.operator.scala
   a->->b
//  ^^^ keyword.operator.scala

   a | b
//   ^ keyword.operator.scala
   a ||| b
//   ^^^ keyword.operator.scala
   a |+ b
//   ^^ keyword.operator.scala

   element +: seq
//         ^^ keyword.operator.scala
   i -= 1
//   ^^ keyword.operator.scala

   b ^? c
//   ^^ keyword.operator.scala

   a ==> b
//   ^^^ keyword.operator.scala

   a >=> b
//   ^^^ keyword.operator.scala
   a &= b
//   ^^ keyword.operator.scala

   a \ b
//   ^ keyword.operator.scala

   a \\ b
//   ^^ keyword.operator.scala

   a \/ b
//   ^^ keyword.operator.scala

   a /\ b
//   ^^ keyword.operator.scala

   a \\\ b
//   ^^^ keyword.operator.scala
