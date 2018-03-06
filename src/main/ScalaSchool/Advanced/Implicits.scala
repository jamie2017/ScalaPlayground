package main.ScalaSchool.Advanced
import scala.math._
case class RectCoord(x: Double, y: Double)
case class PolarCoord(radius: Double, theta: Double)

/**
  * Implicit classes to convert between polar and rectangular coordinates.
  */
object Implicits {
  implicit class RectCoordUtils(r: RectCoord) {
    def toPolar(): PolarCoord = PolarCoord(sqrt((pow(r.x,2) + pow(r.y,2))), atan2(r.y,r.x))
  }

  implicit class PolarCoordUtils(r: PolarCoord) {
    def toRect(): RectCoord = RectCoord(r.radius * cos(r.theta), r.radius * sin(r.theta))
  }

  def main(args: Array[String]): Unit = {
    println(RectCoord(2,3).toPolar())
    println(PolarCoord(5,1).toRect())

  }

}
