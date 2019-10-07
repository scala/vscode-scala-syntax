// SYNTAX TEST "source.scala"


class Stack[A] {
// <-----  keyword.declaration.scala
//   ^ - keyword.declaration.scala entity.name.class.declaration
//    ^^^^^  entity.name.class.declaration
//         ^  source.scala meta.bracket.scala
//          ^  entity.name.class
//           ^  meta.bracket.scala
//             ^  punctuation.section.block.begin.scala
  private var elements: List[A] = Nil
//^^^^^^^ storage.modifier.access
//        ^^^ keyword.declaration.volatile.scala
//            ^^^^^^^^ variable.other.declaration.scala
//                    ^ keyword.operator.scala
//                      ^^^^ entity.name.class
//                          ^ meta.bracket.scala
//                           ^ entity.name.class
//                            ^ meta.bracket.scala
//                              ^ keyword.operator.comparison.scala
//                                ^^^ entity.name.class
    def push(x: A) { elements = x :: elements }
//  ^^^ keyword.declaration.scala
//      ^^^^ entity.name.function.declaration
//          ^ meta.bracket.scala
//           ^ variable.parameter.scala
//            ^ meta.colon.scala
//              ^ entity.name.class
//               ^ meta.bracket.scala
//                 ^ punctuation.section.block.begin.scala
//                   ^^^^^^^^ source.scala
//                            ^ keyword.operator.comparison.scala
//                              ^ source.scala
//                                ^^ keyword.operator.scala
//                                   ^^^^^^^^  source.scala
//                                            ^ punctuation.section.block.end.scala
    def peek: A = elements.head
    def pop(): A = {
      val currentTop = peek
//    ^^^ keyword.declaration.stable.scala
//        ^^^^^^^^^^ variable.other.declaration.scala
//                   ^ keyword.operator.comparison.scala
//                     ^^^^ source.scala
      elements = elements.tail
      currentTop
  }
//^ punctuation.section.block.end.scala
}
// <- punctuation.section.block.end.scala