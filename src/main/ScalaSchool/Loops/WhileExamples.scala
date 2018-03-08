package main.ScalaSchool.Loops

object WhileExamples {
  def readInts:List[Int] = {
    var input = readLine
    var lst = List[Int]()
    while(input != "quit") {
      lst ::= input.toInt
      input = readLine
    }
    lst.reverse
  }

  def main(args: Array[String]): Unit = {
    println(readInts)
  }



}
