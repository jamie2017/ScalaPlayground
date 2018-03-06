package main.ScalaSchool.OOPs

class SingletonUseCases {

}

object MyPrintService {
  def connect(client: String) : Boolean = {
    println("Test message: " + client)
    true
  }
  def print():Unit = {}
}

object TestMyPrintService {
  def main(args: Array[String]) : Unit = {
    MyPrintService.connect("Test")
  }
}
