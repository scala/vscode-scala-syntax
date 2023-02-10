// SYNTAX TEST "source.scala"

   val Foo = ???
// ^^^  keyword.declaration.stable.scala
//     ^^^ variable.stable.declaration.scala

   val foo = ???
// ^^^  keyword.declaration.stable.scala
//     ^^^ variable.stable.declaration.scala

   var Foo = ???
// ^^^ keyword.declaration.volatile.scala
//     ^^^  variable.volatile.declaration.scala

   var foo = ???
// ^^^ keyword.declaration.volatile.scala
//     ^^^ variable.volatile.declaration.scala

  def Foo = ???
//    ^^^ entity.name.function.declaration

  def foo
//    ^^^ entity.name.function.declaration
