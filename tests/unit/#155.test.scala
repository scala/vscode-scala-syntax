// SYNTAX TEST "source.scala"

    transparent inline def foo
//  ^^^^^^^^^^^ storage.modifier.other
//              ^^^^^^ storage.modifier.other

    transparent inline xdef foo
//  ^^^^^^^^^^^ - storage.modifier.other
//              ^^^^^^ - storage.modifier.other

    transparent inline defx foo
//  ^^^^^^^^^^^ - storage.modifier.other
//              ^^^^^^ - storage.modifier.other

    transparent inline final def assert
//  ^^^^^^^^^^^ storage.modifier.other
//              ^^^^^^ storage.modifier.other

    transparent badkeyword inline override def alternative
//  ^^^^^^^^^^^ storage.modifier.other
//                         ^^^^^^ storage.modifier.other

    transparent trait Enum extends Any with Product with Serializable
//  ^^^^^^^^^^^ storage.modifier.other

    opaque type Logarithm = Double
//  ^^^^^^ storage.modifier.other

    opaque private type Matching = Option[Tuple]
//  ^^^^^^ storage.modifier.other

    infix def + (that: Rational) =
//  ^^^^^ storage.modifier.other

    infix type +[X <: Int | String, Y <: Int | String] = (X, Y) match
//  ^^^^^ storage.modifier.other

    open class Open
//  ^^^^ storage.modifier.other

    open final class Foo1
//  ^^^^ storage.modifier.other

open final class Foo1
// <---- storage.modifier.other

   @inline def 
//  ^^^^^^ - storage.modifier.other

   @infix def 
//  ^^^^^ - storage.modifier.other

   @transparent def 
//  ^^^^^^^^^^^ - storage.modifier.other

   @opaque def 
//  ^^^^^^ - storage.modifier.other

   @open def 
//  ^^^^ - storage.modifier.other

   @scala.inline def 
//        ^^^^^^ - storage.modifier.other

   @infix inline def
//  ^^^^^ - storage.modifier.other
//        ^^^^^^ storage.modifier.other

file.open()
//   ^^^^ - storage.modifier.other

