package main.ScalaSchool.Advanced

import scala.util.{Failure, Success, Try}

object Exception {
  def findElementIndex(e: Int, list: List[Int]): Int = {
    val index : Int = list.indexOf(e,0)
    if (index == -1)
      throw new Exception("Element not found")
    index
  }

  def testFindElementIndex(e: Int, list: List[Int]): Unit = {
    Try(findElementIndex(e,list)) match {
      case Success(index) => println(s"Found element at index = $index")
      case Failure(exception) => println(exception.getMessage)
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    testFindElementIndex(3,list)
    testFindElementIndex(6,list)
  }
}
