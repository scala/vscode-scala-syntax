// SYNTAX TEST "source.scala"


class Foo: // shares colour of stable identifier
//    ^^^ entity.name.class.declaration
//       ^ keyword.operator.scala

class Bar : // has same colour as declarations
//    ^^^ entity.name.class.declaration
//        ^ keyword.operator.scala

trait Foo:
//    ^^^ entity.name.class.declaration
//       ^ keyword.operator.scala

trait Bar :
//    ^^^ entity.name.class.declaration
//        ^ keyword.operator.scala

object Foo:
//     ^^^ entity.name.class.declaration
//        ^ keyword.operator.scala

object Bar :
//     ^^^ entity.name.class.declaration
//         ^ keyword.operator.scala

trait *:
//    ^^ entity.name.class.declaration

trait *: :
//    ^^ entity.name.class.declaration
//       ^ keyword.operator.scala

trait :: :
//    ^^ entity.name.class.declaration
//       ^ keyword.operator.scala

class ::
//    ^^ entity.name.class.declaration

class :: :
//    ^^ entity.name.class.declaration
//       ^ keyword.operator.scala

   1 :: Nil
//   ^^ keyword.operator.scala

   1 ::
//   ^^ keyword.operator.scala
