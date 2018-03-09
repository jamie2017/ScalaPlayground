package Advanced

object Curring {
  def add(x:Int): Int => Int = y => x + y

  def add2(x: Int)(y: Int):Int = x + y

  def courseAverage(tests: Int*)(assns: Int*)(quizzes: Int*) = {
    0.4*tests.sum/tests.length + 0.4*assns.sum/assns.length + 0.2*quizzes.sum/quizzes.length
  }

  def main(args: Array[String]): Unit = {
    val plus5 = add(5)
    println(plus5(6) == 11)
    println(plus5(6) == add2(5)(6))
    val plus5_2 = add2(5)_
    println(plus5(6) == plus5_2(6))

    println(courseAverage(90,80)(100,96)(50,32))

    println(add2 {
      println("hi")
      5
    }{
      println("there")
      6
    })


  }

}
