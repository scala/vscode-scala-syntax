// SYNTAX TEST "source.scala"


    given Foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ - entity.name.type.declaration
//        ^^^ entity.name.class
  
    given foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ - entity.name.declaration
//        ^^^ source.scala
  
    given as Foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^ - keyword.declaration.scala
//           ^^^ entity.name.class

    given as foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^ - keyword.declaration.scala
//           ^^^ source.scala

    given bar as foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.declaration
//            ^^ - keyword.declaration.scala
//               ^^^ source.scala

    given Foo as foo = ???
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.type.declaration
//            ^^ - keyword.declaration.scala
//               ^^^ source.scala

    given foo = ???; given Bar as Baz
//  ^^^^^ keyword.declaration.scala
//        ^^^ - entity.name.type.declaration
//                   ^^^^^ keyword.declaration.scala
//                         ^^^ entity.name.type.declaration
//                             ^^ - keyword.declaration.scala
//                                ^^^ entity.name.class

    given Foo = ???; given Bar as Baz
//  ^^^^^ keyword.declaration.scala
//        ^^^ - entity.name.type.declaration
//        ^^^ entity.name.class
//                   ^^^^^ keyword.declaration.scala
//                         ^^^ entity.name.type.declaration
//                             ^^ - keyword.declaration.scala
//                                ^^^ entity.name.class
