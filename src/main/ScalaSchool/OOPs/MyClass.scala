package main.ScalaSchool.OOPs

class MyClass(val name: String, private val age: Int) /*primary constructor */{

  // auxillary constructor
  def this(name: String){
    this(name,100)// primary constructor
  }

  def test(): Unit = {
    println("Test message in MyClass...")
    println(name + " " + age)

  }
}
// similar to static class in Java
object MyObject{
  def test(): Unit = {
    println("Test message in MyObject...")
  }
}

object TestMyClass {
  def main(args: Array[String]): Unit = {
    val m = new MyClass("Test", 18)
    m.test()
    println(m.name)
//    println(m.age) can't access since age is private

    val m1 = new MyClass("Test1")
    m1.test()

    MyObject.test()   // no need to instance

  }
}
