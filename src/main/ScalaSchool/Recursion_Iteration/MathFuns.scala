package main.ScalaSchool.Recursion_Iteration

object MathFuns {
  def factorial(n: Int): BigInt = {
    if (n < 2) 1
    else n * factorial(n - 1)
  }

  def factorial2(n: Int): Int = n match {
      // will cause error if n is negative
    case 0 => 1
    case _ => n * factorial2(n - 1)
  }

  def squareSum(n: Int): BigInt = if (n < 2) 1 else n * n + squareSum(n - 1)


  def squareSum2(n: Int): Int = n match {
    case 1 => 1
    case _ => n * n + squareSum2(n - 1)
  }

  def countDown(n: Int): Unit = {
    if (n > 0) {
      println(n)
      countDown(n -1)
    }
  }

  def countDown2(n: Int): Unit = n match {
    case 0 =>
    case _ => {println(n);countDown2(n - 1)}
  }

  def countDown3(n: Int): Unit = n match {
    case 0 =>
    case x if x % 2 != 0 => {println(n);countDown3(n - 1)}
    case _ => countDown3(n - 1)
  }

  def countFromTo(from: Int, to: Int): Unit = {
    if (from <= to) {
      println(from)
      countFromTo(from + 1, to)
    }
  }

  def main(args: Array[String]) {
//    println(factorial(5))
//    println(squareSum(3))
//
//    countDown(5)
//    countFromTo(1,5)
//    countDown2(5)
//    println(factorial2(3))
//    println(squareSum2(3))

    countDown3(10)
  }

}
