object PFuns {

  def ident[A](o: A): A = o

  def makeTuple[A,B](a: A, b:B): (A,B) = (a,b)

  def threeList[A](a1: A, a2: A, a3: A): List[A] = List(a1,a2,a3)

  def ourFold[A,B](lst: List[A], base: B)(f: (A,B) => B): B = {
    lst match {
      case Nil => base
      case h::t => f(h, ourFold(t, base)(f))
    }
  }
  def main(args: Array[String]): Unit = {
    println(ident(1))
    println(ident(3.2))
    println(ident("Hi"))

    println(makeTuple(1,2))
    println(makeTuple(1,2.2))
    println(makeTuple("Hi",3.2))

    println(threeList(1.2,2.3,3.2))
    println(threeList("Hi",2.3,3.2))
    println(threeList("one","two","three"))

    println(ourFold(List(1,2,3,4,5),0)(_ + _))
    println(ourFold(List(1,2,3,4,5),"")(_ + _))

  }
}