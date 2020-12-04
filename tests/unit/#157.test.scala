// SYNTAX TEST "source.scala"

   val Foo = ???
// ^^^  keyword.declaration.stable.scala
//     ^^^ variable.other.declaration.scala

   val foo = ???
// ^^^  keyword.declaration.stable.scala
//     ^^^ variable.other.declaration.scala

   var Foo = ???
// ^^^ keyword.declaration.volatile.scala
//     ^^^  variable.other.declaration.scala

   var foo = ???
// ^^^ keyword.declaration.volatile.scala
//     ^^^ variable.other.declaration.scala

  def Foo = ???
//    ^^^ entity.name.function.declaration

  def foo 
//    ^^^ entity.name.function.declaration
