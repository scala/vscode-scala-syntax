// SYNTAX TEST "source.scala"

// Old syntax is not supported anymore. We make sure that it is not accidentally highlighted.

    extension on (x: Rational):
//  ^^^^^^^^^ - keyword.declaration.scala
//            ^^ - keyword.declaration.scala
//                ^ variable.parameter.scala
//                   ^^^^^^^^ entity.name.class
       def > (y: Rational): Boolean = y < x

   extension Ops on (x: Rational):
// ^^^^^^^^^ - keyword.declaration.scala
//           ^^^ entity.name.class
//               ^^ - keyword.declaration.scala
//                   ^ variable.parameter.scala
//                      ^^^^^^^^ entity.name.class
      def > (y: Rational): Boolean = y < x

   extension stringOps {  }
// ^^^^^^^^^ - keyword.declaration.scala
//           ^^^^^^^^^ - entity.name.class

   extension {  }
// ^^^^^^^^^ - keyword.declaration.scala
