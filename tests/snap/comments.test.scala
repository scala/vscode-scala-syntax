/// SYNTAX TEST "source.scala"
#!/usr/bin/env scala

//> using packaging.version "1.0.0"
//> using scala 2.13
// > using this.is comment
// //> using comment "out"

//> using
object X

/*  /**/ /** */ /* comments within comments */ */

/**   /* */ /** **/ **/


/************************
 *
 * [[scala.Option]]
 * @return smth
 ***********************/

case class C(val x: Int) {
    def f(p:Double) : String = {

    }
}

/** Provides classes for dealing with complex numbers.  Also provides
 *  implicits for converting to and from `Int`.
 *
 *  ==Overview==
 *  The main class to use is [[my.package.complex.Complex]], as so
 *  {{{
 *  scala> val complex = Complex(4,3)
 *  complex: my.package.complex.Complex = 4 + 3i
 *  }}}
 *
 *  If you include [[my.package.complex.ComplexConversions]], you can
 *  convert numbers more directly
 *  {{{
 *  scala> import my.package.complex.ComplexConversions._
 *  scala> val complex = 4 + 3.i
 *  complex: my.package.complex.Complex = 4 + 3i
 *  }}}
 */
package complex {}

/** A person who uses our application.
 *
 *  @constructor create a new person with a name and age.
 *  @tparam T useless param
 *  @param name the person's name
 *  @param age the person's age in years
 *  @throws java.lang.Exception
 * 
 * @see reference other sources of information like external document links or related entities in the documentation.
 * @note add a note for pre or post conditions, or any other notable restrictions or expectations.
 * @example for providing example code or related example documentation.
 * @usecase  def apply(name: String, age: Int) : Unit 
 * 
 * @groupname group name
 * @groupprio group 2
 * @groupdesc group desc
 * @group group
 * @contentDiagram
 * 
 * 
 *   @author provide author information for the following entity
 *   @version the version of the system or API that this entity is a part of.
 *   @since like @version but defines the system or API that this entity was first defined in.
 *   @todo for documenting unimplemented features or unimplemented aspects of an entity.
 *   @deprecated marks the entity as deprecated, providing both the replacement implementation that should be used and the version/date at which this entity was deprecated.
 *   @migration like deprecated but provides advanced warning of planned changes ahead of deprecation. Same fields as @deprecated.
 *   @inheritdoc take comments from a superclass as defaults if comments are not provided locally.
 *   @documentable Expand a type alias and abstract type into a full template page. - TODO: Test the “abstract type” claim - no examples of this in the Scala code base
 *
 *   @define <name> <definition>
 *   
 *   @shortDescription ???
 *   @hideImplicitConversion ???
 *
 */
class Person[T](name: String, age: Int) {
}

/** Factory for [[mypackage.Person]] instances. */
object Person {
    /** Creates a person with a given name and age.
     *
     *  @param name their name
     *  @param age the age of the person to create
     */
    def apply(name: String, age: Int) = {}
  
    /** Creates a person with a given name and birthdate
     *
     *  @param name their name
     *  @param birthDate the person's birthdate
     *  @return a new Person instance with the age determined by the
     *          birthdate and current date.
     */
    def apply(name: String, birthDate: java.util.Date) = {}
  }

/** Implicit conversions and helpers for [[mypackage.Complex]] instances.
 *
 *  {{{
 *  import ComplexImplicits._
 *  val c: Complex = 4 + 3.i
 *  }}}
 */
object ComplexImplicits {}

/**
  *  =Heading=, ==Sub-Heading==
  * 
  * `monospace`
  * ''italic text''
  * '''bold text'''
  * __underline__
  * ^superscript^
  * ,,subscript,,
  * [[entity link]], e.g. [[scala.collection.Seq]]
  * [[http://external.link External Link]],
  *   e.g. [[http://scala-lang.org Scala Language Site]]
  *  
  */
object Markup {
  /** Here is an unordered list:
  * 
  *   - First item
  *   - Second item
  *     - Sub-item to the second
  *     - Another sub-item
  *   - Third item
  *
  * Here is an ordered list:
  *
  *   1. First numbered item
  *   1. Second numbered item
  *     i. Sub-item to the second
  *     i. Another sub-item
  *   1. Third item
  */
  def lists = ()
}
