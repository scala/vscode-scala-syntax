// SYNTAX TEST "source.scala"


    given intOrd: Ordering[Int] with
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^ entity.name.given.declaration
//                ^^^^^^^^ entity.name.class
//                              ^^^^ keyword.declaration.scala

    given foo: Foo with
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.given.declaration
//             ^^^ entity.name.class
//                 ^^^^ keyword.declaration.scala

    given listOrd[T: Ordering]: Ordering[List[T]] with
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^ entity.name.given.declaration
//                ^ entity.name.class
//                   ^^^^^^^^ entity.name.class
//                              ^^^^^^^^ entity.name.class
//                                                ^^^^ keyword.declaration.scala

    given listOrd(using ev: Ev): Foo with
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^ entity.name.given.declaration
//                ^^^^^ keyword.declaration.scala
//                      ^^ variable.parameter.scala
//                          ^^ entity.name.class
//                               ^^^ entity.name.class
//                                   ^^^^ keyword.declaration.scala

    given Ordering[Int] with
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^^ entity.name.class
//                      ^^^^ keyword.declaration.scala

    given Foo with
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.class
//            ^^^^ keyword.declaration.scala

    given [T: Ordering]: Ordering[List[T]] with
//  ^^^^^ keyword.declaration.scala
//         ^ entity.name.class
//            ^^^^^^^^ entity.name.class
//                       ^^^^^^^^ entity.name.class
//                                         ^^^^ keyword.declaration.scala

    given (using ev: Ev): Foo with
//  ^^^^^ keyword.declaration.scala
//         ^^^^^ keyword.declaration.scala
//               ^^ variable.parameter.scala
//                   ^^ entity.name.class
//                        ^^^ entity.name.class
//                            ^^^^ keyword.declaration.scala

    given intOrd: Ordering[Int] with
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^ entity.name.given.declaration
//                ^^^^^^^^ entity.name.class
//                              ^^^^ keyword.declaration.scala

    given foo: Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.given.declaration
//             ^^^ entity.name.class

    given `foo`: Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^^^ entity.name.given.declaration
//               ^^^ entity.name.class


    given listOrd[T: Ordering]: Ordering[List[T]] = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^ entity.name.given.declaration
//                ^ entity.name.class
//                   ^^^^^^^^ entity.name.class
//                              ^^^^^^^^ entity.name.class

    given listOrd(using ev: Ev): Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^ entity.name.given.declaration
//                ^^^^^ keyword.declaration.scala
//                      ^^ variable.parameter.scala
//                          ^^ entity.name.class
//                               ^^^ entity.name.class

    given Ordering[Int] = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^^^^^^ entity.name.class

    given Foo = ...
//  ^^^^^ keyword.declaration.scala
//        ^^^ entity.name.class

    given [T: Ordering]: Ordering[List[T]] = ...
//  ^^^^^ keyword.declaration.scala
//         ^ entity.name.class
//            ^^^^^^^^ entity.name.class
//                       ^^^^^^^^ entity.name.class

    given (using ev: Ev): Foo = ...
//  ^^^^^ keyword.declaration.scala
//         ^^^^^ keyword.declaration.scala
//               ^^ variable.parameter.scala
//                   ^^ entity.name.class
//                        ^^^ entity.name.class
