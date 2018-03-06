package main.ScalaSchool.OOPs

abstract class MyAbstractFile {
  def open(filename: String): Unit
  def save(filename: String): Unit
}

class MyFile extends MyAbstractFile {
  override def open(filename: String): Unit = {
    println("MyFile.open method called...")
  }

  override def save(filename: String): Unit = {
    println("MyFile.save method called...")
  }

}

class MyCompressedFile extends MyFile {
  override def save(filename: String) = {
    println("MyCompressedFile.save method called...")
    println(">>> Implementing compression logic")
    println(">>> Calling the immediate base save method now...")
    super.save(filename)
  }
}

object TestInhertanceDriver {
  def main(args: Array[String]): Unit = {
    var f: MyAbstractFile = new MyFile()

    println("*** Testing MyFile ***")
    f.open(null)
    f.save(null)

    println("*** Testing MyCompressedFile ***")

    f = new MyCompressedFile()
    f.open(null)
    f.save(null)


  }
}