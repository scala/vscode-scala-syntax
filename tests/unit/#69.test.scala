// SYNTAX TEST "source.scala"

val x = ???
trait Foo[T <: x.type]
//               ^^^^ keyword.type.scala

val a: x.type = ???
//       ^^^^ keyword.type.scala

val b: Foo[x.type] = ???
//           ^^^^ keyword.type.scala
