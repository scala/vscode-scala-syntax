// SYNTAX TEST "source.scala"

    1e12 1e+34 1e-56 1e12f 1e+34f 1e-56f 1e12d 1e+34d 1e-56d
//  ^^^^ constant.numeric.scala
//       ^^^^ constant.numeric.scala
//             ^^^^^ constant.numeric.scala
//                   ^^^^^ constant.numeric.scala
//                         ^^^^^^ constant.numeric.scala
//                                ^^^^^ constant.numeric.scala
//                                       ^^^^^ constant.numeric.scala
//                                             ^^^^^^ constant.numeric.scala
//                                                    ^^^^^^ constant.numeric.scala

    1E12 1E+34 1E-56 1E12f 1E+34f 1E-56f 1E12d 1E+34d 1E-56d
//  ^^^^ constant.numeric.scala
//       ^^^^ constant.numeric.scala
//             ^^^^^ constant.numeric.scala
//                   ^^^^^ constant.numeric.scala
//                         ^^^^^^ constant.numeric.scala
//                                ^^^^^ constant.numeric.scala
//                                       ^^^^^ constant.numeric.scala
//                                             ^^^^^^ constant.numeric.scala
//                                                    ^^^^^^ constant.numeric.scala
    
    .1e12 .1e+34 .1e-56 .1e12f .1e+34f .1e-56f .1e12d .1e+34d .1e-56d
//  ^^^^^ constant.numeric.scala
//        ^^^^^^ constant.numeric.scala
//               ^^^^^^ constant.numeric.scala
//                      ^^^^^^ constant.numeric.scala
//                             ^^^^^^^ constant.numeric.scala
//                                     ^^^^^^^ constant.numeric.scala
//                                             ^^^^^^ constant.numeric.scala
//                                                    ^^^^^^^ constant.numeric.scala
//                                                            ^^^^^^^ constant.numeric.scala
    
    .1E12 .1E+34 .1E-56 .1E12f .1E+34f .1E-56f .1E12d .1E+34d .1E-56d
//  ^^^^^ constant.numeric.scala
//        ^^^^^^ constant.numeric.scala
//               ^^^^^^ constant.numeric.scala
//                      ^^^^^^ constant.numeric.scala
//                             ^^^^^^^ constant.numeric.scala
//                                     ^^^^^^^ constant.numeric.scala
//                                             ^^^^^^ constant.numeric.scala
//                                                    ^^^^^^^ constant.numeric.scala
//                                                            ^^^^^^^ constant.numeric.scala
