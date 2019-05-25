// SYNTAX TEST "source.scala"

object Unicode {

    val blue = '* //red
//            ^ source.scala
//             ^^ source.scala constant.other.symbol.scala
//               ^ source.scala
    val stillRed = '*
//                 ^^ source.scala constant.other.symbol.scala
    val invalidSymbol  = '**_x //'
//                       ^^^ source.scala constant.other.symbol.scala
//                          ^^^ source.scala
    val symbolFollowedByOp = 'symbol*
//                           ^^^^^^^ source.scala constant.other.symbol.scala
//                                  ^ source.scala keyword.operator.arithmetic.scala
    val symbolEndedWithOp  = 'symbol_*
//                           ^^^^^^^^^ source.scala constant.other.symbol.scala
    val unclosedSymbol = '1 //'
//                       ^ source.scala constant.character.literal.scala punctuation.definition.character.begin.scala
//                        ^^^^ source.scala constant.character.literal.scala invalid.illegal.character-literal-too-long
//                            ^ source.scala constant.character.literal.scala punctuation.definition.character.end.scala
    val symbolWithDigit = 'symbol1 //'
//                        ^^^^^^^^ source.scala constant.other.symbol.scala
    val characterLit = 'x'
//                     ^ source.scala constant.character.literal.scala punctuation.definition.character.begin.scala
//                      ^ source.scala constant.character.literal.scala
//                       ^ source.scala constant.character.literal.scala punctuation.definition.character.end.scala
    val greekSymbol = 'ξφδ
//                    ^^^^ source.scala constant.other.symbol.scala
    val greekSymbolDigit = 'φδφ0
//                         ^^^^^ source.scala constant.other.symbol.scala
    val greekSymbolWithOp = 'δφξφξ_+-
//                          ^^^^^^^^^ source.scala constant.other.symbol.scala
    val multiOpSymbol = '***
//                      ^^^^ constant.other.symbol.scala
}
