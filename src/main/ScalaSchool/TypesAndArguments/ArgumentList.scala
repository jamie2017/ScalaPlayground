package TypesAndArguments

object ArgumentList {

  def average(n: Double*):Double = if (n.length > 0) n.sum / n.length else 0


  def main(args: Array[String]): Unit = {
    println(average())
    println(average(1))
    println(average(2,4))
    println(average(2,3,4))

    val nums = List(98.0,95,90,94)
    println(average(nums:_*))
  }

}
