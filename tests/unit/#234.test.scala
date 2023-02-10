// SYNTAX TEST "source.scala"

     val foo = Value
//       ^^^ variable.stable.declaration.scala

     val Mon = Value
//       ^^^ variable.stable.declaration.scala

     val Mon, Tue = Value
//       ^^^ variable.stable.declaration.scala
//            ^^^ variable.stable.declaration.scala

     val Mon, Tue, Wed = Value
//       ^^^ variable.stable.declaration.scala
//            ^^^ variable.stable.declaration.scala
//                 ^^^ variable.stable.declaration.scala

     var Mon = Value
//       ^^^ variable.volatile.declaration.scala

     var Mon, Tue, Wed = Value
//       ^^^ variable.volatile.declaration.scala
//            ^^^ variable.volatile.declaration.scala
//                 ^^^ variable.volatile.declaration.scala
