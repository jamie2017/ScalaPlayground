package main.ScalaSchool.OOPs.Traits

trait Speedometer {
  protected var speed: Float
  def showSpeed: Float
  def accelerate(rate: Float)
  def decelerate(rate: Float)
}

trait GenericSpeedometer[T] {
  protected var speed: T
  def showSpeed: T
  def accelerate(rate: T)
  def decelerate(rate: T)
}
