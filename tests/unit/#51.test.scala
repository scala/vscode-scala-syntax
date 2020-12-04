// SYNTAX TEST "source.scala"

  object Enum extends Enumeration {
    val Foo, Bar, Baz = Value
//  ^^^ keyword.declaration.stable.scala
//      ^^^ variable.other.declaration.scala
//           ^^^ variable.other.declaration.scala
//                ^^^ variable.other.declaration.scala
//                      ^^^^^ entity.name.class

  }
