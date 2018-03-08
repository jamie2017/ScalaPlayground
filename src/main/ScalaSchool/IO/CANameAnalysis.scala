import io.StdIn._

// run code from commend line
// scala CANameAnalysis.scala < CA.txt


type NameData = (String, Int, String,Int)

def parseLine(line: String): NameData = {
  val parts = line.split(",")
  (parts(1),parts(2).toInt,parts(3),parts(4).toInt)
}

val nameLines = Array.fill(367931)(readLine)
val nameData = nameLines.map(parseLine)

//nameData.foreach(println)
val f1988 = nameData.filter(nd => nd._1 == "F" && nd._2 == 1988)
val maxFNames = f1988.map(_._4).max
println(maxFNames)
f1988.filter(_._4 == maxFNames).foreach(println)

val m1988 = nameData.filter(nd => nd._1 == "M" && nd._2 == 1988)
val maxMNames = m1988.map(_._4).max
println(maxMNames)
m1988.filter(_._4 == maxMNames).foreach(println)