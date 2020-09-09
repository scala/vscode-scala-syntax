// SYNTAX TEST "source.scala"


    inline def mkDefaultTypeable[T]: Typeable[T] = ${ TypeableMacros.impl[T] }
//  ^^^^^^ storage.modifier.other
//         ^^^ keyword.declaration.scala

    inline given [T] as Typeable[T] = mkDefaultTypeable[T]
//  ^^^^^^ storage.modifier.other
//         ^^^^^ keyword.declaration.scala
