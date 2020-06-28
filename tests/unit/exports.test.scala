// SYNTAX TEST "source.scala"  
   
    export 
//  ^^^^^^ meta.export.scala keyword.other.export.scala


    export a.x
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^ meta.export.scala entity.name.export.scala

    export a._
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^ meta.export.scala entity.name.export.scala
    
    export a.{x, y}
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
//            ^ meta.export.scala entity.name.export.scala
//             ^^ meta.export.scala meta.export.selector.scala
//               ^ meta.export.scala meta.export.selector.scala entity.name.export.scala
//                ^ meta.export.scala meta.export.selector.scala meta.bracket.scala

    export a.{x => y}
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
//            ^ meta.export.scala meta.export.selector.scala entity.name.export.renamed-from.scala
//             ^ meta.export.scala meta.export.selector.scala
//              ^^ meta.export.scala meta.export.selector.scala
//                ^ meta.export.scala meta.export.selector.scala
//                 ^ meta.export.scala meta.export.selector.scala entity.name.export.renamed-to.scala
//                  ^ meta.export.scala meta.export.selector.scala meta.bracket.scala

    export given
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//         ^^^^^ meta.export.scala

    export given a.x
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//         ^^^^ meta.export.scala
//              ^ meta.export.scala
//               ^ meta.export.scala entity.name.export.scala
//                ^ meta.export.scala punctuation.definition.export
//                 ^ meta.export.scala entity.name.export.scala

    export given a._
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//         ^^^^^ meta.export.scala
//              ^ meta.export.scala
//               ^ meta.export.scala entity.name.export.scala
//                ^ meta.export.scala punctuation.definition.export
//                 ^ meta.export.scala entity.name.export.scala
    
    export given a.{x, y}
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//         ^^^^^ meta.export.scala
//              ^ meta.export.scala
//               ^ meta.export.scala entity.name.export.scala
//                ^ meta.export.scala punctuation.definition.export
//                 ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
//                  ^ meta.export.scala entity.name.export.scala
//                   ^^ meta.export.scala meta.export.selector.scala
//                     ^ meta.export.scala meta.export.selector.scala entity.name.export.scala
//                      ^ meta.export.scala meta.export.selector.scala meta.bracket.scala

    export given a.{x => y}
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//         ^^^^^ meta.export.scala
//              ^ meta.export.scala
//               ^ meta.export.scala entity.name.export.scala
//                ^ meta.export.scala punctuation.definition.export
//                 ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
//                  ^ meta.export.scala meta.export.selector.scala entity.name.export.renamed-from.scala
//                   ^ meta.export.scala meta.export.selector.scala
//                    ^^ meta.export.scala meta.export.selector.scala
//                      ^ meta.export.scala meta.export.selector.scala
//                       ^ meta.export.scala meta.export.selector.scala entity.name.export.renamed-to.scala
//                        ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
