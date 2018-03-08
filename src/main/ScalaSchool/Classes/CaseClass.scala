//package main.ScalaSchool.Classes

// equals, copy, hashcode, toString
// very useful for data transfer objects
case class MyCaseClass(empId: Int, empName: String, empAddr: String)

case class Point3D(x: Double, y: Double, z: Double)

case class Student(name:String, tests: List[Int], assns: List[Int], quizzes: List[Int])



object CaseClasses {

  def distance(p1:Point3D, p2:Point3D):Double = {
    val dx = p1.x-p2.x
    val dy = p1.y-p2.y
    val dz = p1.z-p2.z
    math.sqrt(dx*dx+dy*dy+dz*dz)
  }

  def classAverage(s:Student):Double = {
    0.4*s.tests.sum/s.tests.length + 0.5*s.assns.sum/s.assns.length + 0.1*s.quizzes.sum/s.quizzes.length
  }

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



    val p = new Point3D(1,2,3)
    val q = p.copy(x = p.x + 1)
    println(p)
    println(q)

    // case class pattern

    val points = Array.fill(20)(Point3D(math.random,math.random,math.random))
    for(Point3D(x,y,z) <- points)
      yield math.sqrt(x*x+y*y+z*z)

//    for(Student(n,_,List(a1,a2,a3),_) <- students)

  }
}
