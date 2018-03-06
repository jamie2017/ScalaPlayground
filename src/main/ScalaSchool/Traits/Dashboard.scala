package main.ScalaSchool.Traits

class Dashboard (var speed: Float) extends Speedometer {
  def showSpeed: Float = speed

  def accelerate(rate: Float) = println(f"Accelerating at $rate")

  def decelerate(rate: Float) = println(f"Decelerating at $rate")

}

class GenericDashboard[T](var speed: T) extends GenericSpeedometer[T] {
  def showSpeed: T = speed

  def accelerate(rate: T) = println(f"Accelerating at $rate")

  def decelerate(rate: T) = println(f"Decelerating at $rate")

}
