// SYNTAX TEST "source.scala"

  object Enum extends Enumeration {
    val Foo, Bar, Baz = Value
//  ^^^ keyword.declaration.stable.scala
//      ^^^ constant.other.declaration.scala
//           ^^^ constant.other.declaration.scala
//                ^^^ constant.other.declaration.scala
//                      ^^^^^ entity.name.class

  }
