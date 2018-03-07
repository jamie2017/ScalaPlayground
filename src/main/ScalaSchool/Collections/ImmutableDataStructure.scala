package main.ScalaSchool.Collections

import io.StdIn._

object ImmutableDataStructure {

  def inputList(n: Int): List[Int] = {
    if (n < 1) Nil
    else readInt :: inputList(n - 1)
  }

  def fillList(n: Int, v: Double): List[Double] = {
    if (n < 1) Nil
    else v:: fillList(n - 1,v)
  }

  def operateOnList(lst: List[Int], base: Int, f:(Int, Int) => Int): Int = {
    if (lst == Nil) base
    else f(lst.head, operateOnList(lst.tail, base, f))
  }

  def operateOnList2(lst: List[Int], base: Int, f:(Int, Int) => Int): Int = lst match {
    case Nil => base
    case h::t => f(h,operateOnList2(t,base,f))
  }


  def main(args: Array[String]): Unit = {
//    val lst = inputList(5)
//    println(lst)
//    println(operateOnList(lst,0, _+_))
//    println(operateOnList2(lst,0, _+_))
    println(fillList(3,Math.random))// pass by reference
    println(List.fill(3)(Math.random)) // List.fill pass by value


    println(List.tabulate(3)(_*2))
    println(List.tabulate(3)(i => Math.random))

  }

}
