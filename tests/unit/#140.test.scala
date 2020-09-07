// SYNTAX TEST "source.scala"

   given foo.Foo
// ^^^^^ keyword.declaration.scala
//       ^^^ - entity.name.declaration
//           ^^^ entity.name.class

   given Foo[a]
// ^^^^^ keyword.declaration.scala
//       ^^^ - entity.name.type.declaration
//       ^^^ entity.name.class
