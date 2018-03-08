import scala.io.Source
import java.io.FileNotFoundException

object ReadName {
  def main(args: Array[String]): Unit = {
    try {
      val source = Source.fromFile("fiveNums.txt")
      println(source.mkString)
      try {
        val lines = source.getLines
        while(lines.hasNext) {
          println(lines.next)
        }
      } catch {
        case e: NumberFormatException => println("The file contained a non-number")
      } finally {
        source.close()
      }
    } catch {
      case ex:FileNotFoundException => println("That file doesn't exist.")
    }
  }
}




