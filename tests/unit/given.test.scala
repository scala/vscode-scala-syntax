// SYNTAX TEST "source.scala"


    given Foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.type.declaration
  
    given foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.declaration
  
    given as Foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^ keyword.declaration.scala
//           ^^^ entity.name.class

    given as foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^ keyword.declaration.scala
//           ^^^ source.scala

    given bar as foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.declaration
//            ^^ keyword.declaration.scala
//               ^^^ source.scala

    given Foo as foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.type.declaration
//            ^^ keyword.declaration.scala
//               ^^^ source.scala
