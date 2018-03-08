import scala.io.Source


val source = Source.fromURL("http://www.stackoverflow.com")
println(source.mkString)
