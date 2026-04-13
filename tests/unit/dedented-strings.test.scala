// SYNTAX TEST "source.scala"

object DedentedStringLiterals {
  
  // Triple single quote strings
  val str1 = '''
//           ^^^ punctuation.definition.string.begin.scala
//           ^^^^^^ string.quoted.triple.scala
    Hello
//  ^^^^^ string.quoted.triple.scala
    World
//  ^^^^^ string.quoted.triple.scala
  '''
//^^^ punctuation.definition.string.end.scala
//^^^ string.quoted.triple.scala

  // Four single quote strings
  val str2 = ''''
//           ^^^^ punctuation.definition.string.begin.scala
//           ^^^^^^^^ string.quoted.triple.scala
    Nested
//  ^^^^^^ string.quoted.triple.scala
    ''' quotes
//  ^^^^^^^^^^^ string.quoted.triple.scala
  ''''
//^^^^ punctuation.definition.string.end.scala
//^^^^ string.quoted.triple.scala

  // Five single quote strings
  val str3 = '''''
//           ^^^^^ punctuation.definition.string.begin.scala
//           ^^^^^^^^^^ string.quoted.triple.scala
    More
//  ^^^^ string.quoted.triple.scala
    '''' quotes
//  ^^^^^^^^^^^ string.quoted.triple.scala
  '''''
//^^^^^ punctuation.definition.string.end.scala
//^^^^^ string.quoted.triple.scala

  // Six single quote strings
  val str4 = ''''''
//           ^^^^^^ punctuation.definition.string.begin.scala
//           ^^^^^^^^^^^^ string.quoted.triple.scala
    Even more
//  ^^^^^^^^^ string.quoted.triple.scala
    ''''' quotes
//  ^^^^^^^^^^^^ string.quoted.triple.scala
  ''''''
//^^^^^^ punctuation.definition.string.end.scala
//^^^^^^ string.quoted.triple.scala

  // Interpolated triple single quote strings
  val name = "World"
  val str5 = s'''
//           ^ keyword.interpolation.scala
//            ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
    Hello $name
//  ^^^^^^ string.quoted.triple.interpolated.scala
//        ^ punctuation.definition.template-expression.begin.scala
//         ^^^^ meta.template.expression.scala
  '''
//^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.end.scala

  // Raw triple single quote strings
  val str6 = raw'''
//           ^^^ keyword.interpolation.scala
//              ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
    Raw $name content
//  ^^^^ string.quoted.triple.interpolated.scala
//      ^ punctuation.definition.template-expression.begin.scala
//       ^^^^ meta.template.expression.scala
//           ^^^^^^^^ string.quoted.triple.interpolated.scala
  '''
//^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.end.scala

  // Custom interpolated triple single quote strings
  val str7 = custom'''
//           ^^^^^^ keyword.interpolation.scala
//                 ^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.begin.scala
    Custom $name content
//  ^^^^^^^ string.quoted.triple.interpolated.scala
//         ^ punctuation.definition.template-expression.begin.scala
//          ^^^^ meta.template.expression.scala
//              ^^^^^^^^ string.quoted.triple.interpolated.scala
  '''
//^^^ string.quoted.triple.interpolated.scala punctuation.definition.string.end.scala

  // Make sure regular strings still work
  val regular1 = """
//               ^^^ punctuation.definition.string.begin.scala
    Regular triple quotes
  """
//^^^ punctuation.definition.string.end.scala

  val regular2 = "Regular double quotes"
//               ^ punctuation.definition.string.begin.scala
//               ^^^^^^^^^^^^^^^^^^^^^^ string.quoted.double.scala
//                                     ^ punctuation.definition.string.end.scala

  // Edge case: mismatched delimiters should not close
  val str8 = ''''
    This has four quotes to open
    ''' but only three to close, so this should not end the string
    This line should still be part of the string
  ''''
//^^^^ punctuation.definition.string.end.scala

}