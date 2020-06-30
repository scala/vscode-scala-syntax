// SYNTAX TEST "source.scala"

    new Foo:
//  ^^^ keyword.declaration.scala
      ...
    end new
//  ^^^ keyword.declaration.end.scala
//      ^^^ keyword.declaration.end.scala

    end if
//  ^^^ keyword.control.flow.end.scala
//      ^^ keyword.control.flow.end.scala

    end while
//  ^^^ keyword.control.flow.end.scala
//      ^^^^^ keyword.control.flow.end.scala
    
    end for
//  ^^^ keyword.control.flow.end.scala
//      ^^^ keyword.control.flow.end.scala

    end match
//  ^^^ keyword.control.flow.end.scala
//      ^^^^^ keyword.control.flow.end.scala

  class Foo
//      ^^^ entity.name.class.declaration
    end Foo
//  ^^^ keyword.declaration.end.scala
//      ^^^ entity.name.type.declaration

    def foo
//      ^^^ entity.name.function.declaration
    end bar
//  ^^^ keyword.declaration.end.scala
//      ^^^ entity.name.declaration

    end `bar`
//  ^^^ keyword.declaration.end.scala
//      ^^^ entity.name.declaration

    end
//  ^^^ keyword.declaration.end.scala