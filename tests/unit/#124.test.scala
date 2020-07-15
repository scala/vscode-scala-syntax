// SYNTAX TEST "source.scala"

def foo(x: A with B, c: C): Int = 0
//           ^^^^ keyword.declaration.scala
//                ^ entity.other.inherited-class.scala
//                 ^ source.scala

class B extends A with B,
//                ^^^^ keyword.declaration.scala
//                     ^ entity.other.inherited-class.scala
//                      ^ source.scala
  
class B extends A with B:
//                ^^^^ keyword.declaration.scala
//                     ^ entity.other.inherited-class.scala
//                      ^ source.scala

class B extends A:
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A,
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A'
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ punctuation.definition.character.begin.scala

class B extends A|
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A+
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A-
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A*
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A&
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends A^
//      ^^^^^^^ keyword.declaration.scala
//              ^ entity.other.inherited-class.scala
//               ^ source.scala

class B extends `A`
//      ^^^^^^^ keyword.declaration.scala
//              ^^^ entity.other.inherited-class.scala
