// SYNTAX TEST "source.scala"

trait A extends B
//      ^^^^^^^ keyword.declaration.scala

trait A extends (B => B){}
//      ^^^^^^^ keyword.declaration.scala
