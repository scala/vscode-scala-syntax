// SYNTAX TEST "source.scala"


    val a :: b =
        x :: Nil
    end val
//  ^^^ source.scala keyword.declaration.stable.end.scala
//      ^^^ source.scala keyword.declaration.stable.end.scala

    var a :: b =
        x :: Nil
    end var
//  ^^^ source.scala keyword.declaration.volatile.end.scala
//      ^^^ source.scala keyword.declaration.volatile.end.scala