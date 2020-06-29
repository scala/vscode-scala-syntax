// SYNTAX TEST "source.scala"

    extension on (x: Rational):
//  ^^^^^^^^^ keyword.declaration.scala
//            ^^ keyword.declaration.scala
//                ^ variable.parameter.scala
//                   ^^^^^^^^ entity.name.class
       def > (y: Rational): Boolean = y < x

   extension Ops on (x: Rational):
// ^^^^^^^^^ keyword.declaration.scala
//           ^^^ entity.name.class
//               ^^ keyword.declaration.scala
//                   ^ variable.parameter.scala
//                      ^^^^^^^^ entity.name.class
      def > (y: Rational): Boolean = y < x

   extension stringOps {  }
// ^^^^^^^^^ keyword.declaration.scala
//           ^^^^^^^^^ entity.name.class

   extension {  }
// ^^^^^^^^^ keyword.declaration.scala
