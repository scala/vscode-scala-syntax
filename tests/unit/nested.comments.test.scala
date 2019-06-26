# SYNTAX TEST "source.scala"

// check that `//` comments don't consume block comments. See #39


/*** // **/
#    ^^^^^^ - comment.line.double-slash.scala  
 var a
#^^^ keyword.declaration.volatile.scala
/*   // */
# -  ^^^^^ comment.line.double-slash.scala
 var b
#^^^ keyword.declaration.volatile.scala
/**
  * // */
#   ^^^^^ - comment.line.double-slash.scala
 object C {}
#^^^^^^ keyword.declaration.scala
/* 
  // */
  ^^^^^ - comment.line.double-slash.scala
object D {}
^^^^^^ keyword.declaration.scala
/* http://link/with/scheme */
object E {}
#      ^ entity.name.class.declaration