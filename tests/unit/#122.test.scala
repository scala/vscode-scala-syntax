// SYNTAX TEST "source.scala"

    new Foo
//  ^^^ keyword.declaration.scala
//      ^^^ entity.name.class
      
    new foo.Foo
//  ^^^ keyword.declaration.scala
//      ^^^^ source.scala
//          ^^^ entity.name.class

    new Foo.Foo
//  ^^^ keyword.declaration.scala
//      ^^^ entity.name.class
//         ^ source.scala
//          ^^^ entity.name.class
