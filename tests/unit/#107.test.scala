// SYNTAX TEST "source.scala"

    new Foo:
      ...
    end new
//  ^^^ keyword.control.flow.end.scala
//      ^^^ keyword.control.flow.end.scala

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
//  ^^^ keyword.control.flow.end.scala
//      ^^^ entity.name.type.declaration

    def foo
//      ^^^ entity.name.function.declaration
    end bar
//  ^^^ keyword.control.flow.end.scala
//      ^^^ entity.name.declaration

    end `bar`
//  ^^^ keyword.control.flow.end.scala
//      ^^^ entity.name.declaration
