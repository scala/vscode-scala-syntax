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
//         ^^^^^ keyword.other.export.given.scala

    export a.given
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^^^^^ meta.export.scala keyword.other.export.given.scala
    
    export a.{x, y, given}
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
//            ^ meta.export.scala entity.name.export.scala
//             ^^ meta.export.scala meta.export.selector.scala
//               ^ meta.export.scala meta.export.selector.scala entity.name.export.scala
//                ^^ source.scala meta.export.scala meta.export.selector.scala
//                  ^^^^^ keyword.other.export.given.scala 
//                       ^ meta.export.scala meta.export.selector.scala meta.bracket.scala

    export a.{x => y, given}
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
//                   ^ meta.export.scala meta.export.selector.scala
//                    ^^^^^ keyword.other.export.given.scala 
//                         ^ meta.export.scala meta.export.selector.scala meta.bracket.scala

    export A.{a, given Ordering[?]}
//  ^^^^^^ meta.export.scala keyword.other.export.scala
//        ^ meta.export.scala
//         ^ meta.export.scala entity.name.class.export.scala
//          ^ meta.export.scala punctuation.definition.export
//           ^ meta.export.scala meta.export.selector.scala meta.bracket.scala
//            ^ meta.export.scala entity.name.export.scala
//             ^^ meta.export.scala meta.export.selector.scala
//               ^^^^^ meta.export.scala keyword.other.export.given.scala
//                    ^ meta.export.scala meta.export.selector.scala
//                     ^^^^^^^^ meta.export.scala entity.name.class.export.scala
//                             ^^^^ meta.export.scala meta.export.selector.scala
