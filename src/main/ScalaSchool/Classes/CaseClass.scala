package main.ScalaSchool.Classes

// equals, copy, hashcode, toString
// very useful for data transfer objects
case class MyCaseClass(empId: Int, empName: String, empAddr: String)


object Test {
  def main(args: Array[String]) : Unit = {
    val m1 = new MyCaseClass(100,"Test1", "Somwhere1")
    val m2 = new MyCaseClass(200,"Test2", "Somwhere2")

    println(m1 == m2) // false
    val m3 = m1.copy()
    println(m1 == m3) // true
    println(m1)
    println(m1.hashCode())
    val m4 = m1.copy(empId = 200)
    println(m1 == m4) // false
  }
}
