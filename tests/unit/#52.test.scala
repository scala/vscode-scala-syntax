// SYNTAX TEST "source.scala"

   ' '
// ^ punctuation.definition.character.begin.scala
//  ^ constant.character.literal.scala
//   ^ punctuation.definition.character.end.scala

   '
// ^ punctuation.definition.character.begin.scala
   '
// ^ punctuation.definition.character.begin.scala

   Class[T']
// ^^^^^ entity.name.class
//      ^ meta.bracket.scala
//       ^ entity.name.class
//        ^ punctuation.definition.character.begin.scala
//         ^ invalid.illegal.character-literal-too-long
Class[Int]

Error: T' Int
//     ^ entity.name.class
//      ^ punctuation.definition.character.begin.scala
//       ^^^^ invalid.illegal.character-literal-too-long

Error: T'  Int
//     ^ entity.name.class
//      ^ punctuation.definition.character.begin.scala
//       ^^^^^ invalid.illegal.character-literal-too-long

Error: T'  Int
//     ^ entity.name.class
//      ^ punctuation.definition.character.begin.scala
//       ^^^^^ invalid.illegal.character-literal-too-long

Error: T'😀 Int
//     ^ entity.name.class
//      ^^^ constant.other.symbol.scala
//          ^^^ entity.name.class

Error: T'😀😀 Int
//     ^ entity.name.class
//      ^^^^^ constant.other.symbol.scala
//            ^^^ entity.name.class

Error: T'aa Int
//     ^ entity.name.class
//      ^^^ constant.other.symbol.scala



Error: T'aa' Int
//     ^ entity.name.class
//      ^ punctuation.definition.character.begin.scala
//       ^^ invalid.illegal.character-literal-too-long
//         ^ punctuation.definition.character.end.scala