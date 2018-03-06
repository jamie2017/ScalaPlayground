package main.ScalaSchool.Advanced


object Functions {
  def createPowerOfPartiallyApplied(exponent: Double, base: Double): Double = {
    scala.math.pow(base, exponent)
  }

  def createPowerOfWithCurrying(exponent: Double)(base: Double): Double = {
    scala.math.pow(base, exponent)
  }

  def createPowerOf(exponent: Double): (Double => Double) = {

    /*
     * Alternatively can be written like this...
     *
     * 		def createPowerOf(exponent: Double): (Double => Double) = {
     *
     * 			def wrapper(base: Double): Double = {
     * 				scala.math.pow(base, exponent)
     * 			}
     *
     * 			wrapper _
     * 		}

    */

    base => scala.math.pow(base, exponent)
  }

  def main(args: Array[String]): Unit = {

    val power_of_2 = createPowerOf(2)
    println(power_of_2(3))

    val power_of_3 = createPowerOf(3)
    println(power_of_3(3))

    val power_of_2_with_currying = createPowerOfWithCurrying(2) _
    println(power_of_2_with_currying(3))

    println(createPowerOfWithCurrying(3)(3))

    val power_of_2_partial = createPowerOfPartiallyApplied(2, _: Double)
    println(power_of_2_partial(5))
  }
}