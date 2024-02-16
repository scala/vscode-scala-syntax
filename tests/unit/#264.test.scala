// SYNTAX TEST "source.scala"


   import foo.as
// ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^^^ meta.import.scala entity.name.import.scala
//            ^^ meta.import.scala entity.name.import.scala


   import bar as baz
// ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^^^ meta.import.scala entity.name.import.scala
//            ^^ meta.import.scala keyword.other.import.as.scala
//               ^^^ meta.import.scala entity.name.import.scala

