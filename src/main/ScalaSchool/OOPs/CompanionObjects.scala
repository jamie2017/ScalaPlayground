package main.ScalaSchool.OOPs

class TestClass {
  TestObject.instanceCnt += 1
//  def test(): Unit = {TestObject.printMsg()}
}

object TestObject {
  var instanceCnt: Int = 0

  def printInstanceCnt(): Unit = {println("Instance Count " + instanceCnt)}
}


object Main {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
      new TestClass()
    TestObject.printInstanceCnt()
    // Instance Count 10
  }
}