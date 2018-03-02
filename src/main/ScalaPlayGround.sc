for(i <- 0 until 20) {
  (i % 3, i % 5) match {
    case (0,0) => println("FizzBuzz")
    case (0,_) => println("Fizz")
    case (_,0) => println("Buzz")
    case  _    =>
  }
}


lazy val x = (1 to 100).toList
x.reduce(_ + _)

// loops
for(i <- 1 to 5) println(i)
for(i <- 5 to 1 by -1) println(i)
for(i <- 5 to 1 by -2) println(i)
// for loop with a guard condition
// for with an if inside
for (i <- 1 to 5; j <- 1 to 4) println(s"($i, $j)")
for (i <- 1 to 5; j <- 1 to 4 if i == j) println(s"($i,$j)")

for (i <- 1 to 20 if i % 2 == 0) println(i)

// yield = the result of each for loop iteration is sorted in a list(Vector)
val xx = for (i <- 1 to 20 if i % 2 == 0) yield(i)


def areaRectWithType(l : Float, b: Float): Float = l * b

def areaRectWithoutType(l : Float, b: Float): Unit = println(l * b)

//def areaRectWithoutType(l : Float, b: Float) = println(l * b)


def isEvenNumber(n: Int):Boolean = n % 2 == 0

def areaRect(l : Int, b: Int = 10): Int = l * b



// Collections

// Arrays
// fix size

val arr = new Array[Int](10)
arr(0)
arr(0) = 100
arr.foreach(println)

val arrString = new Array[String](3)
arrString(0) = "Test"
arrString

val arrInit = Array(1,2,3,4)

// ArrayBuffer == ArrayList in Java
import scala.collection.mutable.ArrayBuffer

val arrBuffer = new ArrayBuffer[Int]()
arrBuffer += 100
arrBuffer += 200
arrBuffer
arrBuffer += (300, 400, 500)
arrBuffer.foreach(println)
arrBuffer  ++= Array(600,700,800)
arrBuffer
arrBuffer  --= Array(600,800)
arrBuffer

arrBuffer.trimEnd(2) // Removes last 2 elements
//scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200, 300, 400)
arrBuffer.insert(2,9) // Adds element at 2nd index
//scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200, 9, 300, 400)
arrBuffer.insert(2,10,11,12)// adds a list
//scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200, 10, 11, 12, 9, 300, 400)
arrBuffer.remove(2)// remove an element
//scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200, 11, 12, 9, 300, 400)
arrBuffer.remove(2,3) // removes three elements from index 2
//scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 200, 300, 400)

for (ele <- arrBuffer if ele % 2 == 0) yield(2 * ele)
arrBuffer.filter(_ % 2 == 0).foreach(println)

arrBuffer.max
arrBuffer.min


// Map
// immutable map
val im = Map(1 -> "Benny", 2 -> "Jenny")
//scala.collection.immutable.Map[Int,String] = Map(1 -> Benny, 2 -> Jenny)
// error if im -= 1

import scala.collection.mutable.Map
val mm = Map(1 -> "Benny", 2 -> "Jenny")
mm -= 1
mm(2)
mm.get(1)
mm.getOrElse(1,"Key not found")
mm += (1 -> "New Benny")

// Use of immutable:
//1. data integrity
//2. synchronization overhead is minimised.


// Tuples
// -> Tuple is more generalized form of pair
// -> Tuple has more than two values of potentially different types
val aTuple = (1,4,"Bob","Jack") // like Python, value of tuple in scala cant be changed
// -> Accessing the tuple elements

aTuple._2 // or aTuple _2
// -> In Tuples, the offset starts with 1 and NOT from 0

// -> Tuples are typically used for the functions which return more than one value
"Good Morning, My Princess!".partition(_.isUpper)
// (String, String) = (GMMP,ood orning, y rincess!)

