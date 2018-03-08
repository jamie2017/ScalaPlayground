import java.io.PrintWriter
import java.io.FileWriter

object PrintWrite {
  def printNewFile(): Unit = {
    val pw = new PrintWriter("file.txt")
    pw.println("The first line")
    pw.println("The second line")
    pw.close
  }

  def appendFile():Unit = {
    val pw = new PrintWriter(new FileWriter("file.txt",true))
    pw.println("More stuff.")
    pw.println("Goes after original contents")
    pw.close
  }

  def main(args: Array[String]): Unit = {
    printNewFile()

    appendFile()
  }
}


