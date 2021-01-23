/// SYNTAX TEST "source.scala"
// From: https://dotty.epfl.ch/docs/reference/other-new-features/indentation.html

package p1.p2:

   abstract class C() with

      def this(x: Int) =
         this()
         if x > 0 then
            val a :: b =
               x :: Nil
            end val
            var y =
               x
            end y
            while y > 0 do
               println(y)
               y -= 1
            end while
            try
               x match
                  case 0 => println("0")
                  case _ =>
               end match
            finally
               println("done")
            end try
         end if
      end this

      def f: String
   end C

   object C with
      given C =
         new C:
            def f = "!"
            end f
         end new
      end given
   end C

   extension (x: C)
      def ff: String = x.f ++ x.f
   end extension

end p2
