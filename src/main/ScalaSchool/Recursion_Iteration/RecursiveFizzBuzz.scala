package main.ScalaSchool.Recursion_Iteration

import scala.collection.mutable.ListBuffer

object RecursiveFizzBuzz {
  def fizzBuzzRecur(n: Int):Unit = {
    if (n > 0) {
      fizzBuzzRecur(n - 1)
      (n % 3, n % 5) match  {
        case (0,0) => println("FizzBuzz")
        case (0,_) => println("Fizz")
        case (_,0) => println("Buzz")
        case _     => println(n)
      }
    }
  }


  def fizzBuzzNonRecur(n: Int):Unit = {
    for( i <- 1 to n) {
      (i % 3 , i % 5) match {
        case (0,0) => println("FizzBuzz")
        case (0,_) => println("Fizz")
        case (_,0) => println("Buzz")
        case _     => println(i)
      }
    }
  }

  def fizzBuzzToList(n: Int): List[String] = {
    var result = List[String]()
    for( i <- 1 to n) {
      (i % 3 , i % 5) match {
        case (0,0) => result ::= "FizzBuzz"
        case (0,_) => result ::= "Fizz"
        case (_,0) => result ::= "Buzz"
        case _ => result ::= ("" + i)
      }
    }
    result.reverse
  }

  def fizzBuzzToListBuffer(n: Int): List[String] = {
    var result = new ListBuffer[String]()
    for( i <- 1 to n) {
      (i % 3 , i % 5) match {
        case (0,0) => result += "FizzBuzz"
        case (0,_) => result += "Fizz"
        case (_,0) => result += "Buzz"
        case _ => result += ("" + i)
      }
    }
    result.toList
  }




  def main(args: Array[String]): Unit = {
//    fizzBuzzRecur(15)
//    fizzBuzzNonRecur(15)
    fizzBuzzToList(15).foreach(println)
  }
}
