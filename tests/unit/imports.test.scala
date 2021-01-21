// SYNTAX TEST "source.scala"  
   
    import
//  ^^^^^^ meta.import.scala keyword.other.import.scala


    import a.x
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala entity.name.import.scala

    import a._
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala entity.name.import.scala
    
    import a.{x, y}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^ meta.import.scala entity.name.import.scala
//             ^^ meta.import.scala meta.import.selector.scala
//               ^ meta.import.scala meta.import.selector.scala entity.name.import.scala
//                ^ meta.import.scala meta.import.selector.scala meta.bracket.scala

    import a.{x => y}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^ meta.import.scala meta.import.selector.scala entity.name.import.renamed-from.scala
//             ^ meta.import.scala meta.import.selector.scala
//              ^^ meta.import.scala meta.import.selector.scala
//                ^ meta.import.scala meta.import.selector.scala
//                 ^ meta.import.scala meta.import.selector.scala entity.name.import.renamed-to.scala
//                  ^ meta.import.scala meta.import.selector.scala meta.bracket.scala

    import a.`given`
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^^^^^^^ - keyword.other.import.given.scala

    import a.given
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^^^^^ meta.import.scala keyword.other.import.given.scala
    
    import A.{given}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^ meta.import.scala keyword.other.import.given.scala
//                 ^ meta.import.scala meta.import.selector.scala


    import A.{`given`, _}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^^^ - keyword.other.import.given.scala
//                   ^^ meta.import.scala meta.import.selector.scala
//                     ^ meta.import.scala entity.name.import.scala
//                      ^ meta.import.scala meta.import.selector.scala

    import A.{given, _}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^ meta.import.scala keyword.other.import.given.scala
//                 ^^ meta.import.scala meta.import.selector.scala
//                   ^ meta.import.scala entity.name.import.scala
//                    ^ meta.import.scala meta.import.selector.scala


    import A.{given TC}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^ meta.import.scala keyword.other.import.given.scala
//                 ^ meta.import.scala meta.import.selector.scala
//                  ^^ meta.import.scala entity.name.class.import.scala
//                    ^ meta.import.scala meta.import.selector.scala

    import A.{a, given Ordering[?]}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^ meta.import.scala entity.name.import.scala
//             ^^ meta.import.scala meta.import.selector.scala
//               ^^^^^ meta.import.scala keyword.other.import.given.scala
//                    ^ meta.import.scala meta.import.selector.scala
//                     ^^^^^^^^ meta.import.scala entity.name.class.import.scala
//                             ^^^^ meta.import.scala meta.import.selector.scala

    import A.{given Ordering[?], given ExecutionContext}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^ meta.import.scala keyword.other.import.given.scala
//                 ^ meta.import.scala meta.import.selector.scala
//                  ^^^^^^^^ meta.import.scala entity.name.class.import.scala
//                          ^^^^^ meta.import.scala meta.import.selector.scala
//                               ^^^^^ meta.import.scala keyword.other.import.given.scala
//                                    ^ meta.import.scala meta.import.selector.scala
//                                     ^^^^^^^^^^^^^^^^ meta.import.scala entity.name.class.import.scala
//                                                     ^ meta.import.scala meta.import.selector.scala

    import A.givenSomething
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^^^^^^^^^^^^^^ meta.import.scala entity.name.import.scala

    import givenPackage.x
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^^^^^^^^^^^^ meta.import.scala entity.name.import.scala
//                     ^ meta.import.scala punctuation.definition.import
//                      ^ meta.import.scala entity.name.import.scala