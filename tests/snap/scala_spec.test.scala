package org.scala.syntax
package test


class TreeMap[A <: Comparable[A], B] { }
class List[A] { }
class I extends Comparable[I] {}

class F[M[_], X] { }
class S[K <: String] {}
class G[M[ Z <: I ], I] { }

case class Bird (val name: String @suspendable) extends Object {
    def fly(height: Int @suspendable) = ???
    def walk[T1 : T2](_distance: Int, empty_? : Int, `yield`: String, αρετη: Boolean)(implicit fa: Functor[T1]) = ???
    def c (x: Int) (y: String, z: String): String = ???
    def union[A <: Comparable[A]] (x: Set[A], xs: Set[A]): Set[A]
}

trait Iterable[+X] {
    def flatMap[newType[+X] <: Iterable[X], S](f: X => newType[S]): newType[S]
}

package org.scala {
  class List[+T]
  class Set[-T]
}

class A[+T] {}
class B extends A[B]
class C extends A[C]



abstract class AbstractClass
sealed trait Sealed

object Types {
    val x : String @suspendable = ""

    def infix() : T1 \/ T2 = ???

   type Z1  = Ref[T] forSome { type T <: java.lang.Number }
   type Z2  = Ref[x.T] forSome { val x: Outer }
   type Z3  = Ref[x_type # T] forSome { type x_type <: Outer with Singleton }

   def complexBounds[A, B >: A, C >: A <: B]()
   def complexBounds2[M[X <: Bound[X]], Bound[_]]
   def complexBounds3[@specialized T, U]()

   def compare[T](a: T = 0)(b: T = a) = (a == b)
   def f(a: Int = 0)(b: Int = a + 1) = b

   def whileLoop (cond: => Boolean) (stat: => Unit): Unit

   def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def write(str: String) { System.out.println(str) }
  def write(str: String): Unit = { System.out.println(str) }

   

    type Pair[+A, +B] = Tuple2[A, B]
    object Pair {
      { import M.{one, z => zero, _}; add(zero, one) }
        def apply[A, B](x: A, y: B) = Tuple2(x, y)
        def unapply[A, B](x: Tuple2[A, B]): Option[Tuple2[A, B]] = Some(x)
    }
}

object ValueDefinitions {
  val pi = 3.1415
  val pi: Double = 3.1415   // equivalent to first definition
  val Some(x) = f()         // a pattern definition
  val x :: xs = mylist      // an infix pattern definition
}

class Iter extends StringIterator with RichIterator {  }
trait A extends Root { type T <: A }

class Modifiers {
    final val x = e
    override def f()
    private val y = ""
    abstract override def g()
    private lazy final val h = 3
}

object m {
    abstract sealed class C (x: Int) {
      def nextC = new C(x + 1) {}
    }
    val empty = new C(0) {}
}

class LinkedList[A]() { self: List with Seq =>
    var head = ???
    var tail = null
    def isEmpty = tail != null
    def this(head: A) = { this(); this.head = head }
    def this(head: A, tail: List[A]) = { this(head); this.tail = tail }
}

case class Lambda(x: String, e: Expr) extends Expr

trait Comparable[T <: Comparable[T]] { self: T =>
    def < (that: T): Boolean
    def <=(that: T): Boolean = this < that || this == that
    def > (that: T): Boolean = that < this
    def >=(that: T): Boolean = that <= this
}

class A extends Root { override def x = "A" ; def superA = super.x }

object Appl {
    def sum(xs: Int*) = (0 /: xs) ((x, y) => x + y)
    sum(List(1, 2, 3, 4): _*)

    val x : S = new Z
    val y : S = new Z {
        val x = 5
    }

    def matmul(xss: Array[Array[Double]], yss: Array[Array[Double]]) = {
        val zss: Array[Array[Double]] = new Array(xss.length, yss(0).length)
        var i = 0
        while (i < xss.length) {
          var j = 0
          while (j < yss(0).length) {
            var acc = 0.0
            var k = 0
            while (k < yss.length) {
              acc = acc + xss(i)(k) * yss(k)(j)
              k += 1
            }
            zss(i)(j) = acc
            j += 1
          }
          i += 1
        }
        zss
    }

    def whileLoop(cond: => Boolean)(body: => Unit): Unit  =
      if (cond) { body ; whileLoop(cond)(body) } else {}

    do {x += 2} while (x < 100)

    for  { i <- 1 until n
        j <- 1 until i
        if isPrime(i+j)
    } yield (i, j)

    (1 until n)
    .flatMap {
     case i => (1 until i)
       .withFilter { j => isPrime(i+j) }
       .map { case j => (i, j) } }

    try {
        throw ex;
    } catch {
        case NonFatal(e) => throw e;
        case other => throw other
    }
}

object Inline {
    val summ = (x: Int,y: Int) => x + y 
}

object Monoids {
    implicit object stringMonoid extends Monoid[String] {
      def add(x: String, y: String): String = x.concat(y)
      def unit: String = ""
    }
}

object A1 {
    def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
      if (xs.isEmpty) m.unit
      else m.add(xs.head, sum(xs.tail))

    implicit def list2ordered[A](x: List[A])
      (implicit elem2ordered: A => Ordered[A]): Ordered[List[A]]
}

object PatternMatching {
    def f(x: Int, y: Int) = x match {
        case `y` => 
        case  s @ Seq(_, _, _) => 
        case Seq(first, tail @ _*) =>
        case first +: tail =>
        case 3 | 5 | 6 =>
        case y: Number => y.n
        case Lit(n)        => n
        case IsZero(u)     => eval(u) == 0
        case _ => 15
    }

}

package p1 {
    package p2 {
        object Kitten
    }
}

package a.b {
    class A {
      val x = new _root_.b.B
    }
}

object HelloWorld {
    def main(args: Array[String]) { println("Hello World") }
}

object HelloWorld extends App {
    println("Hello World")
}

@SerialVersionUID(12345)
object Annotations {
    @deprecated("Use D", "1.0") class C {  }
    @transient @volatile var m: Int       

    def f(x: Option[Int]) = (x: @unchecked) match {
        case Some(y) => y
    }

    trait Function0[@specialized(Unit, Int, Double) T] {
        def apply: T
    }

    @UserDefinedUpperCase def x
    @userDefinedLowerCase def y
}

enum A:
  case B, c, D

enum A extends B, C with D derives E, F
