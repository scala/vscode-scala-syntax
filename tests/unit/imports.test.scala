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

    import a.{given _}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^ meta.import.scala keyword.given.import.scala
//                 ^ meta.import.scala meta.import.selector.scala
//                  ^ meta.import.scala entity.name.import.scala
//                   ^ meta.import.scala meta.import.selector.scala

    import A.{given TC}
//  ^^^^^^ meta.import.scala keyword.other.import.scala
//        ^ meta.import.scala
//         ^ meta.import.scala entity.name.class.import.scala
//          ^ meta.import.scala punctuation.definition.import
//           ^ meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^ meta.import.scala keyword.given.import.scala
//                 ^ meta.import.scala meta.import.selector.scala
//                  ^^ meta.import.scala entity.name.class.import.scala
//                    ^ meta.import.scala meta.import.selector.scala
