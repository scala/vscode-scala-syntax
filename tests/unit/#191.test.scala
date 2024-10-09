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
