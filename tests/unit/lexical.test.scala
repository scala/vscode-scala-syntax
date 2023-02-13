// SYNTAX TEST "source.scala"

object ExampleIdentifiers {
  val x = 3
//    ^ variable.stable.declaration.scala
  val Object = 3
  val maxIndex = 3
//    ^^^^^^^^ variable.stable.declaration.scala
  val p2p = 3
//    ^^^ variable.stable.declaration.scala
  val empty_? = 3
//    ^^^^^^^ variable.stable.declaration.scala
  val + = 3
//    ^ variable.stable.declaration.scala
  val `yield` = 3
//    ^^^^^^^ variable.stable.declaration.scala
  val αρετη = 3
  val _y = 3
//    ^^ variable.stable.declaration.scala
  val dot_product_* = 3
//    ^^^^^^^^^^^^^ variable.stable.declaration.scala
  val __system = 3
//    ^^^^^^^^ variable.stable.declaration.scala

  val _MAX_LEN_ = 3
//    ^^^^^^^^^ variable.stable.declaration.scala
}

object IntegerLiterals {
  (0, 21,  0xFFFFFFFF, -42L)
// ^ constant.numeric.scala
//    ^^ constant.numeric.scala
//         ^^^^^^^^^^ constant.numeric.scala
//                     ^ keyword.operator.arithmetic.scala
//                      ^^^ constant.numeric.scala
}

object FloatingPointLiterals {
  ( 0.0, 1e30f, 3.14159f, 1.0e-100, .1  )
//  ^^^ constant.numeric.scala
//              ^^^^^^^^ constant.numeric.scala
//                        ^^^^^^^^ constant.numeric.scala
//                                  ^^ constant.numeric.scala
}

object Boolean {
    (true, false)
//   ^^^^ constant.language.scala
//         ^^^^^ constant.language.scala
}

object CharacterLiterals {
    ('a',    '\u0041',    '\n',    '\t')
//   ^ punctuation.definition.character.begin.scala
//   ^^^ constant.character.literal.scala
//     ^ punctuation.definition.character.end.scala
//           ^^^^^^^^  constant.character.literal.scala
//            ^^^^^^   constant.character.escape.scala
//                         ^^ constant.character.escape.scala
//                                  ^^ constant.character.escape.scala
}

object StringLiterals {
    ("Hello,\nWorld!",  "This string contains a \" character.")
//   ^ punctuation.definition.string.begin.scala
//   ^^^^^^^^^^^^^^^^ string.quoted.double.scala
//          ^^ constant.character.escape.scala
//                  ^ punctuation.definition.string.end.scala
//                      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ string.quoted.double.scala
    """the present string
//  ^^^ punctuation.definition.string.begin.scala
//  ^^^^^^^^^^^^^^^^^^^^^ string.quoted.triple.scala
     spans three
//   ^^^^^^^^^^^ string.quoted.triple.scala
     lines."""
//   ^^^^^^^^^ string.quoted.triple.scala
//         ^^^ punctuation.definition.string.end.scala

    """the present string
      |spans three
      |lines.""".stripMargin


  val escapeSequences = "\b\t\n\f\r\"\'\\"
  //                    ^^^^^^^^^^^^^^^^^^ string.quoted.double.scala
  //                     ^^^^^^^^^^^^^^^^  constant.character.escape.scala

  s"$x plain ${val x = y}"
//^ keyword.interpolation.scala
// ^ punctuation.definition.string.begin.scala
//  ^ punctuation.definition.template-expression.begin.scala
//   ^ - string.quoted.double.interpolated.scala string.quoted.double.scala
//    ^^^^^^^ string.quoted.double.interpolated.scala
//           ^^^^^^^^^^^^ meta.template.expression.scala
//           ^^ punctuation.definition.template-expression.begin.scala
//             ^^^^^^^^^ meta.embedded.line.scala
//             ^^^ keyword.declaration.stable.scala
//             ^^^^^^^^^   - string.quoted.double.interpolated.scala string.quoted.double.scala
//                      ^ punctuation.definition.template-expression.end.scala
//                       ^   string.quoted.double.interpolated.scala  punctuation.definition.string.end.scala

  custom"$x plain ${val x = y}"
//^^^^^^ keyword.interpolation.scala
//      ^ punctuation.definition.string.begin.scala
//       ^ punctuation.definition.template-expression.begin.scala
//        ^ - string.quoted.double.interpolated.scala string.quoted.double.scala
//         ^^^^^^^ string.quoted.double.interpolated.scala
//                ^^^^^^^^^^^^ meta.template.expression.scala
//                ^^ punctuation.definition.template-expression.begin.scala
//                  ^^^^^^^^^ meta.embedded.line.scala
//                  ^^^ keyword.declaration.stable.scala
//                  ^^^^^^^^^   - string.quoted.double.interpolated.scala string.quoted.double.scala
//                           ^ punctuation.definition.template-expression.end.scala
//                            ^   string.quoted.double.interpolated.scala  punctuation.definition.string.end.scala

object Symbols {
    ('x, 'X, 'αρετη, '=, '+ )
//   ^^ constant.other.symbol.scala
//       ^^ constant.other.symbol.scala
//           ^^^^^^ constant.other.symbol.scala
}

    // single line comment
//  ^^ punctuation.definition.comment.scala
//  ^^^^^^^^^^^^^^^^^^^^^^ comment.line.double-slash.scala

   /*
// ^^   punctuation.definition.comment.scala
    multiline comment*/
//  ^^^^^^^^^^^^^^^^^^^ comment.block.scala
  /**
   * Scaladoc comment
   * @scaladoc @param
   */

   /*  nested /* multi-line */ comment */


object Xml {
    val b = <book>
//          ^ punctuation.definition.tag.xml
//           ^^^^ entity.name.tag.localname.xml
//               ^ punctuation.definition.tag.xml
//          ^^^^^^ meta.tag.xml
          <title>The Scala Language Specification</title>
//               ^^^ entity.name.class
//                   ^^^^^ entity.name.class
//                         ^^^^^^^^ entity.name.class
//                                  ^^^^^^^^^^^^^ entity.name.class
          <version>{scalaBook.version}</version>
          <authors>{scalaBook.authors.mkList("", ", ", "")}</authors>
        </book>
}

class Parens {
  capture("layout(" ~ oneOrMore(CharPredicate.All -- ")" -- ')') ~ ")")
//                                                           ^ string.quoted.other constant.character.literal.scala
  capture("layout(" ~ oneOrMore(CharPredicate.All -- ")" -- `)`) ~ ")")
}
