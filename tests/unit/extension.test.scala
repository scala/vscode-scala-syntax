// SYNTAX TEST "source.scala"

    extension (x: T) def combine (y: T): T
//  ^^^^^^^^^ keyword.declaration.scala
//             ^ variable.parameter.scala
//              ^ meta.colon.scala
//                ^ entity.name.class
//                   ^^^ keyword.declaration.scala
//                       ^^^^^^^ entity.name.function.declaration


    extension [T](x: T) def combine (y: T): T
//  ^^^^^^^^^ keyword.declaration.scala
//             ^ entity.name.class
//                ^ variable.parameter.scala
//                 ^ meta.colon.scala
//                   ^ entity.name.class
//                      ^^^ keyword.declaration.scala
//                          ^^^^^^^ entity.name.function.declaration
