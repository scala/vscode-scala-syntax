// SYNTAX TEST "source.scala"

   enum Color:
// ^^^^ keyword.declaration.scala
//      ^^^^^ entity.name.class.declaration
    case Red, Green, Blue, Magenta
//  ^^^^ keyword.control.flow.scala
//            ^^^^^ entity.name.class
//                   ^^^^ entity.name.class
//                         ^^^^^^^ entity.name.class

   enum Vehicle(val numberOfWheels: Int):
// ^^^^ keyword.declaration.scala
//      ^^^^^^^ entity.name.class.declaration
//              ^^^ keyword.declaration.stable.scala
//                  ^^^^^^^^^^^^^^ variable.other.declaration.scala
//                                  ^^^ entity.name.class
     case Unicycle extends Vehicle(1)
//   ^^^^ source.scala keyword.control.flow.scala
//        ^^^^^^^^ entity.name.class
//                 ^^^^^^^ keyword.declaration.scala
//                         ^^^^^^^ entity.other.inherited-class.scala
//                                ^ meta.bracket.scala
//                                 ^ constant.numeric.scala
//                                  ^ meta.bracket.scala
     
     case Bicycle extends Vehicle(2)
//   ^^^^ source.scala keyword.control.flow.scala
//        ^^^^^^^ entity.name.class
//                ^^^^^^^ keyword.declaration.scala
//                        ^^^^^^^ entity.other.inherited-class.scala
//                               ^ meta.bracket.scala
//                                ^ constant.numeric.scala
//                                 ^   meta.bracket.scala
