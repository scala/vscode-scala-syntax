// SYNTAX TEST "source.scala"

   (using)
// ^ meta.bracket.scala
//  ^^^^^ source.scala
//       ^ meta.bracket.scala
   
   (using  )
// ^ meta.bracket.scala
//  ^^^^^^^ source.scala
//         ^ meta.bracket.scala

   (using , )
// ^ meta.bracket.scala
//  ^^^^^^^^ source.scala
//          ^ meta.bracket.scala

   (usingSomething)
// ^ meta.bracket.scala
//  ^^^^^^^^^^^^^^ source.scala
//                ^ meta.bracket.scala             
