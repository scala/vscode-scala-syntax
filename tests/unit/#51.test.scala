// SYNTAX TEST "source.scala"

  object Enum extends Enumeration {
    val Foo, Bar, Baz = Value
//  ^^^ keyword.declaration.stable.scala
//      ^^^ - variable.other.declaration.scala
//           ^^^ - variable.other.declaration.scala
//                ^^^ - variable.other.declaration.scala
//                      ^^^^^ entity.name.class

    val foo, bar, baz = Value
//  ^^^ keyword.declaration.stable.scala
//      ^^^ - variable.other.declaration.scala
//           ^^^ - variable.other.declaration.scala
//                ^^^ - variable.other.declaration.scala
//                      ^^^^^ entity.name.class

    val (foo
//  ^^^ keyword.declaration.stable.scala
//      ^^^ - variable.other.declaration.scala

    val `foo`,
//  ^^^ keyword.declaration.stable.scala
//      ^^^^^ - variable.other.declaration.scala
    
    var Foo,
//  ^^^ keyword.declaration.volatile.scala
//      ^^^ - variable.other.declaration.scala

    var foo,
//  ^^^ keyword.declaration.volatile.scala
//      ^^^ - variable.other.declaration.scala

    var `foo`,
//  ^^^ keyword.declaration.volatile.scala
//      ^^^^^ - variable.other.declaration.scala

    var (foo
//  ^^^ keyword.declaration.volatile.scala
//      ^^^ - variable.other.declaration.scala
    
    val Some(x) = 
//  ^^^ keyword.declaration.stable.scala
//      ^^^^ - variable.other.declaration.scala

    val some(x) =
//  ^^^ keyword.declaration.stable.scala
//      ^^^^ - variable.other.declaration.scala
  }
