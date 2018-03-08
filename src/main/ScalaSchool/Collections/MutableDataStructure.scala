package main.ScalaSchool.Collections

object MutableDataStructure {

  def fillArray(arr: Array[Int], v: Int, i: Int): Unit  = {
    if (i < arr.length){
      arr(i) = v
      fillArray(arr,v,i + 1)
    }
  }

  def operateArray(arr: Array[Int], i: Int, f: (Int, Int) => Int): Int = {
    if (i < arr.length - 1) {
      f(arr(i), operateArray(arr, i + 1, f))
    } else {
      arr(i)
    }
  }


  def main(args: Array[String]): Unit = {
    val arr = Array(1,1,1,1,1,1)
    fillArray(arr,99,0)
    println(arr.mkString(","))

    val arr2 = Array(1,2,3,4,5)
    println(operateArray(arr2, 0, _ + _))
    println(operateArray(arr2, 0, _ * _))

    var i = 0
    val arr3 = Array.fill(10)({i += 1; i})
//    arr3.foreach(println)
    println(arr3.mkString(","))

    val arr4 = Array.range(1,11) // [)
//    arr4.foreach(println)
    println(arr4.mkString(","))

//    .tabulate
    val arr5 = Array.tabulate(10)(i => i) // Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
      println(arr5.mkString(","))
    val arr6 = Array.tabulate(10)(i => i + 1)//Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(arr6.mkString(","))
    val arr7 = Array.tabulate(10)(i => i * 2) //Array(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)
    println(arr7.mkString(","))


  }

}
