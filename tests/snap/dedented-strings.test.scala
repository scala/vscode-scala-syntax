object DedentedStringLiterals {
  
  // Triple single quote strings
  val str1 = '''
    Hello
    World
  '''

  // Four single quote strings
  val str2 = ''''
    Nested
    ''' quotes
  ''''

  // Five single quote strings
  val str3 = '''''
    More
    '''' quotes
  '''''

  // Six single quote strings
  val str4 = ''''''
    Even more
    ''''' quotes
  ''''''

  // Interpolated triple single quote strings
  val name = "World"
  val str5 = s'''
    Hello $name
  '''

  // Raw triple single quote strings
  val str6 = raw'''
    Raw $name content
  '''

  // Custom interpolated triple single quote strings
  val str7 = custom'''
    Custom $name content
  '''

  // Make sure regular strings still work
  val regular1 = """
    Regular triple quotes
  """

  val regular2 = "Regular double quotes"

  // Edge case: mismatched delimiters should not close
  val str8 = ''''
    This has four quotes to open
    ''' but only three to close, so this should not end the string
    This line should still be part of the string
  ''''

}