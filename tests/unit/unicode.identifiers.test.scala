// SYNTAX TEST "source.scala"

class Φδφκξ(x : Int, δφξκξ: Int, val y: Int, val φξ: Int) { 
// <-----  keyword.declaration.scala
//    ^^^^^  entity.name.class.declaration
//         ^  meta.bracket.scala
//          ^  variable.parameter.scala
//            ^  meta.colon.scala
//              ^^^  entity.name.class
//                   ^^^^^  variable.parameter.scala
//                        ^  meta.colon.scala
//                          ^^^  entity.name.class
//                               ^^^  keyword.declaration.stable.scala
//                                   ^  variable.other.declaration.scala
//                                    ^  keyword.operator.scala
//                                      ^^^  entity.name.class
//                                           ^^^  keyword.declaration.stable.scala
//                                               ^^  variable.other.declaration.scala
//                                                 ^  keyword.operator.scala
//                                                   ^^^  entity.name.class
//                                                      ^  meta.bracket.scala
//                                                        ^  punctuation.section.block.begin.scala
  def δφξ() = 3
//^^^  keyword.declaration.scala
//    ^^^  entity.name.function.declaration
//       ^^  meta.parentheses.scala meta.bracket.scala
//          ^  keyword.operator.comparison.scala
  val δφξ = 4
//^^^  keyword.declaration.stable.scala
//    ^^^  variable.other.declaration.scala
//        ^  keyword.operator.comparison.scala
  var δφξ = 5
//^^^  keyword.declaration.volatile.scala
//    ^^^  variable.other.declaration.scala
//        ^  keyword.operator.comparison.scala
  def δφξ(δφξκξ: Int) = ()
//^^^  keyword.declaration.scala
//    ^^^  entity.name.function.declaration
//       ^  meta.bracket.scala
//        ^^^^^  variable.parameter.scala
//             ^  meta.colon.scala
//               ^^^  entity.name.class
//                  ^  meta.bracket.scala
//                    ^  keyword.operator.comparison.scala
//                      ^^  meta.parentheses.scala meta.bracket.scala
  def foo(fj: Int) = ()
//^^^  keyword.declaration.scala
//    ^^^  entity.name.function.declaration
//       ^  meta.bracket.scala
//        ^^  variable.parameter.scala
//          ^  meta.colon.scala
//            ^^^  entity.name.class
//               ^  meta.bracket.scala
//                 ^  keyword.operator.comparison.scala
//                   ^^  meta.parentheses.scala meta.bracket.scala

  val Constant = 3
//^^^  keyword.declaration.stable.scala
//    ^^^^^^^^  variable.other.declaration.scala
//             ^  keyword.operator.comparison.scala
  val Константа = 4
//^^^  keyword.declaration.stable.scala
//    ^^^^^^^^^  variable.other.declaration.scala
//              ^  keyword.operator.comparison.scala
  
}


trait * { }
// <-----   keyword.declaration.scala
//    ^  entity.name.class.declaration
//      ^  punctuation.section.block.begin.scala
//        ^  punctuation.section.block.end.scala
class * { }
// <-----   keyword.declaration.scala
//    ^  entity.name.class.declaration
//      ^  punctuation.section.block.begin.scala
//        ^  punctuation.section.block.end.scala
case class **(x: Int) {}
// <----   keyword.declaration.scala
//   ^^^^^  keyword.declaration.scala
//         ^^  entity.name.class.declaration
//           ^  meta.bracket.scala
//            ^  variable.parameter.scala
//             ^  meta.colon.scala
//               ^^^  entity.name.class
//                  ^  meta.bracket.scala

trait f_*[A,x] {
// <-----   keyword.declaration.scala
//    ^^^  entity.name.class.declaration
//       ^  meta.bracket.scala
//        ^  entity.name.class
//           ^  meta.bracket.scala
//             ^  punctuation.section.block.begin.scala

  type * = Int
//^^^^  keyword.declaration.scala
//     ^  entity.name.type.declaration
//       ^  keyword.operator.comparison.scala
//         ^^^  entity.name.class
  type x_* = Int
//^^^^  keyword.declaration.scala
//     ^^^  entity.name.type.declaration
//         ^  keyword.operator.comparison.scala
//           ^^^  entity.name.class
 }


import scala.colection.Seq
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^^^^^^^^^  meta.import.scala entity.name.import.scala
//                    ^  meta.import.scala punctuation.definition.import
//                     ^^^  meta.import.scala entity.name.class.import.scala
import users._  // import everything from the users package
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^  meta.import.scala entity.name.import.scala


import users.User  // import the class User
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^^^^  meta.import.scala entity.name.class.import.scala
//                 ^^  comment.line.double-slash.scala punctuation.definition.comment.scala
//                   ^^^^^^^^^^^^^^^^^^^^^^  comment.line.double-slash.scala
import users.{User, UserPreferences}  // Only imports selected members
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^  meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^  meta.import.scala meta.import.selector.scala entity.name.class.import.scala
//                ^^  meta.import.scala meta.import.selector.scala
//                  ^^^^^^^^^^^^^^^  meta.import.scala meta.import.selector.scala entity.name.class.import.scala
//                                 ^  meta.import.scala meta.import.selector.scala meta.bracket.scala



import users.{UserPreferences => UPrefs}  // import and rename for convenience
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^  meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^^^^^^^^^^^^^  meta.import.scala meta.import.selector.scala entity.name.class.import.renamed-from.scala
//                           ^  meta.import.scala meta.import.selector.scala
//                            ^^  meta.import.scala meta.import.selector.scala keyword.other.arrow.scala
//                              ^  meta.import.scala meta.import.selector.scala
//                               ^^^^^^  meta.import.scala meta.import.selector.scala entity.name.class.import.renamed-to.scala
//                                     ^  meta.import.scala meta.import.selector.scala meta.bracket.scala




import δκφξ._
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^  meta.import.scala entity.name.import.scala
//         ^  meta.import.scala punctuation.definition.import
//          ^  meta.import.scala entity.name.import.scala
import φξξ0ξ.δκφξ
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^^^^  meta.import.scala entity.name.import.scala
import φξ_+.{+,-, id}
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^  meta.import.scala entity.name.import.scala
//         ^  meta.import.scala punctuation.definition.import
//          ^  meta.import.scala meta.import.selector.scala meta.bracket.scala
//           ^  meta.import.scala meta.import.selector.scala entity.name.import.scala
//            ^  meta.import.scala meta.import.selector.scala
//             ^  meta.import.scala meta.import.selector.scala entity.name.import.scala
//              ^^  meta.import.scala meta.import.selector.scala
//                ^^  meta.import.scala meta.import.selector.scala entity.name.import.scala
//                  ^  meta.import.scala meta.import.selector.scala meta.bracket.scala
import δφξ_+.{δφξ => φξ}
// <------  meta.import.scala keyword.other.import.scala
//    ^  meta.import.scala
//     ^^^^^  meta.import.scala entity.name.import.scala
//          ^  meta.import.scala punctuation.definition.import
//           ^  meta.import.scala meta.import.selector.scala meta.bracket.scala
//            ^^^  source.scala meta.import.scala meta.import.selector.scala entity.name.import.renamed-from.scala
//               ^  meta.import.scala meta.import.selector.scala
//                ^^  meta.import.selector.scala keyword.other.arrow.scala
//                  ^  meta.import.scala meta.import.selector.scala
//                   ^^  meta.import.scala meta.import.selector.scala entity.name.import.renamed-to.scala
//                     ^  meta.import.scala meta.import.selector.scala meta.bracket.scala


