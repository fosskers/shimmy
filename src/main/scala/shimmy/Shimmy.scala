package shimmy

import scalaz._
import Scalaz._
import shims._
import com.monovore.decline._

object Shimmy extends CommandApp(
  name = "shimmy",
  header = "Demonstrate how shims works.",
  main = {
    /* These are `decline` data types with `Applicative` instances from Cats */
    val foo = Opts.option[String]("foo", help = "Foo")
    val bar = Opts.option[Int]("bar", help = "Bar")
    val baz = Opts.flag("baz", help = "Baz").orFalse

    /* These are ScalaZ operators that use ScalaZ's `Applicative` */
    (foo |@| bar |@| baz) { (_, _, _) => println("It worked!") }
  }
)
