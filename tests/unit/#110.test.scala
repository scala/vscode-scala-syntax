// SYNTAX TEST "source.scala"

    import java.io.BufferedReaded
//  ^^^^^^ keyword.other.import.scala
//         ^^^^ entity.name.import.scala
//              ^^ entity.name.import.scala
//                 ^^^^^^^^^^^^^^ entity.name.class.import.scala

    import foo._
//  ^^^^^^ keyword.other.import.scala
//         ^^^ entity.name.import.scala
//             ^ entity.name.import.scala

    import foo.Bar
//  ^^^^^^ keyword.other.import.scala
//         ^^^ entity.name.import.scala
//             ^^^ entity.name.class.import.scala

    import foo.Bar._
//  ^^^^^^ keyword.other.import.scala
//         ^^^ entity.name.import.scala
//             ^^^ entity.name.class.import.scala
//                 ^ entity.name.import.scala

    import foo.Foo.Bar._
//  ^^^^^^ keyword.other.import.scala
//         ^^^ entity.name.import.scala
//             ^^^ entity.name.class.import.scala
//                 ^^^ entity.name.class.import.scala

    import foo.{Foo, bar}
//  ^^^^^^ keyword.other.import.scala
//         ^^^ entity.name.import.scala
//              ^^^ entity.name.class.import.scala
//                   ^^^ entity.name.import.scala

    import foo.{Foo => Bar, bar => foo}
//  ^^^^^^ keyword.other.import.scala
//         ^^^ entity.name.import.scala
//              ^^^ meta.import.scala meta.import.selector.scala entity.name.class.import.renamed-from.scala
//                  ^^ meta.import.scala
//                     ^^^ meta.import.scala meta.import.selector.scala entity.name.class.import.renamed-to.scala
//                          ^^^ meta.import.scala meta.import.selector.scala entity.name.import.renamed-from.scala
//                              ^^ meta.import.scala meta.import.selector.scala keyword.other.arrow.scala
//                                 ^^^ meta.import.scala meta.import.selector.scala entity.name.import.renamed-to.scala
