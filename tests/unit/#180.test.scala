// SYNTAX TEST "source.scala"

   case '{ Array[T]()(using $ct) } =>
//                    ^^^^^ keyword.declaration.scala

   case '{ Array[T]()(using ($ct: ClassTag[T])) } =>
//                    ^^^^^ keyword.declaration.scala
