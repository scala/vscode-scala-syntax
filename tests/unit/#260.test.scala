// SYNTAX TEST "source.scala"

  val x = ''' + '"'
//        ^^^ constant.character.literal.scala
//        ^ punctuation.definition.character.begin.scala
//          ^ punctuation.definition.character.end.scala
//            ^ keyword.operator.arithmetic.scala

  val x = '''' + '"'
//        ^^^^ constant.character.literal.scala
//        ^ punctuation.definition.character.begin.scala
//          ^ punctuation.definition.character.end.scala
//           ^ punctuation.definition.character.begin.scala
