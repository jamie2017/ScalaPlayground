//immutable,one-indexed,may be of mixed type

val t = (1, "hello", Console) // val t = new Tuple3(1, "hello", Console)

val tuple = ("apple", "dog")
val fruit = tuple._1
val animal = tuple._2

fruit //should be("apple")
animal //should be("dog")

//val tuple5 = ("a", 1, 2.2, new Date(), "five")
//
//tuple5._2 should be(1)
//tuple5._5 should be("five")



val student = ("Sean Rogers", 21, 3.5)
val (name, age, gpa) = student

//name should be(
//  "Sean Rogers"
//)
//age should be(
//  21
//)
//gpa should be(
//  3.5
//)

//The swap method can be used to swap the elements of a Tuple2:

val tuple6 = ("apple", 3).swap
//tuple6._1 should be(
//  3
//)
//tuple6._2 should be(
//  "apple"
//)