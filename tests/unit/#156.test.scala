// SYNTAX TEST "source.scala"


    class Foo extends
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.class.declaration
//            ^^^^^^^ keyword.declaration.scala

    class Foo extends Bar with Baz
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.class.declaration
//            ^^^^^^^ keyword.declaration.scala
//                    ^^^ source.scala entity.name.class
//                        ^^^^ keyword.declaration.scala
//                             ^^^ entity.other.inherited-class.scala

    class Foo extends Bar, Baz
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.class.declaration
//            ^^^^^^^ keyword.declaration.scala
//                    ^^^ entity.name.class
//                       ^^ source.scala
//                         ^^^ source.scala entity.name.class

    class Foo extends Bar with
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.class.declaration
//            ^^^^^^^ keyword.declaration.scala
//                    ^^^ source.scala entity.name.class
//                        ^^^^ keyword.declaration.scala


    given tc: TC with {}
//  ^^^^^ keyword.declaration.scala
//        ^^ entity.name.given.declaration
//            ^^ entity.name.class
//               ^^^^ keyword.declaration.scala

    given Liftable[Boolean] with {
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^^ entity.name.class
//                 ^^^^^^^ entity.name.class
//                          ^^^^ keyword.declaration.scala

    given listMonad: Monad[List] with
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^^^ entity.name.given.declaration
//                   ^^^^^ entity.name.class
//                         ^^^^ entity.name.class
//                               ^^^^ keyword.declaration.scala

    enum Opt[+T] derives Eq {
//  ^^^^ keyword.declaration.scala
//       ^^^ entity.name.class.declaration
//            ^ entity.name.class
//               ^^^^^^^ keyword.declaration.scala
//                       ^^ entity.name.class

    enum Opt[+T] derives
//  ^^^^ keyword.declaration.scala
//       ^^^ entity.name.class.declaration
//            ^ entity.name.class
//               ^^^^^^^ keyword.declaration.scala

    enum Opt[+T] derives Eq, Foo
//  ^^^^ keyword.declaration.scala
//       ^^^ entity.name.class.declaration
//            ^ entity.name.class
//               ^^^^^^^ keyword.declaration.scala
//                       ^^ source.scala entity.name.class
//                         ^^ source.scala
//                            ^^^ source.scala entity.name.class
