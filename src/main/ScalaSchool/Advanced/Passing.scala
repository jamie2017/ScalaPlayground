package Advanced

object Passing {

  def incr(i: Int): Int = {
    println("Then start incr")
    i + 1
  }

  def incrFunc(i: () => Int): Int = {
    println("Then start incr")
    i() + 1
  }

  // passing by name : =>
  def incrByName(i: => Int): Int = {
    println("Then start incr")
    i + 1
  }

  def normalCube(i: Int): Int = i * i * i

  def cubeByName(i: => Int): Int = i * i * i

  def threeTuple(i:Int) = (i,i,i)

  def threeTupleByName(i: => Int) = (i,i,i)


  def main(args: Array[String]): Unit = {
    println(incr({
      println("First eval args")
      3 + 4
    }))


    println(incrFunc({
      println("First eval args")
      () => 3 + 4
    }))

    println(incrByName({
      println("First eval args")
      3 + 4
    }))


    var a = 0
    println(normalCube(a))
    println(cubeByName({a += 1;a}))

    println(threeTuple(util.Random.nextInt(10)))
    println(threeTupleByName(util.Random.nextInt(10)))

  }

}
