//https://www.youtube.com/watch?v=TNSe0QzLx4E
trait MyReallySweetAwesomeAbstraction {
  val height: Int
  val width: Int
  val area: Int = height * width
}

case class Square(h: Int, w: Int)
  extends {
  val height = h
  val width = w
  }
  with MyReallySweetAwesomeAbstraction

Square(10,10).height == 10
Square(10,10).area == 100


//or better

trait MyReallySweetAwesomeAbstraction2 {
  def height: Int
  def width: Int
  def area: Int = height * width
}

case class Square2(height: Int, width: Int)
  extends  MyReallySweetAwesomeAbstraction2

Square2(10,10).height == 10
Square2(10,10).area == 100


