
object ExampleIdentifiers {
  val x = 3
  val Object = 3        
  val maxIndex = 3   
  val p2p = 3      
  val empty_? = 3
  val + = 3         
  val `yield` = 3       
  val αρετη = 3     
  val _y = 3       
  val dot_product_* = 3
  val __system = 3  
  val _MAX_LEN_ = 3
}

object IntegerLiterals {
  (0, 21,  0xFFFFFFFF, -42L)        
}

object FloatingPointLiterals {
  ( 0.0, 1e30f, 3.14159f, 1.0e-100, .1  )
}

object Boolean {
    (true, false)
}

object CharacterLiterals {
    ('a',    '\u0041',    '\n',    '\t')
}

object StringLiterals {
    ("Hello,\nWorld!",  "This string contains a \" character.")

    """the present string
     spans three
     lines."""

    """the present string
      |spans three
      |lines.""".stripMargin


  val escapeSequences = "\b\t\n\f\r\"\'\\"

  s"$x plain ${val x = y}"
  custom"$x plain ${val x = y}"

  s"""$x plain ${val x = y}"""
  custom"""$x plain ${val x = y}"""
}

object Symbols {
    ('x, 'X, 'αρετη, '=, '+ )
}

// single line comment

  /*
  
multiline comment*/

  /**
   * Scaladoc comment
   * @scaladoc @param 
   */

   /*  nested /* multi-line */ comment */


object Xml {
    val b = <book>
          <title>The Scala Language Specification</title>
          <version>{scalaBook.version}</version>
          <authors>{scalaBook.authors.mkList("", ", ", "")}</authors>
        </book>
}
