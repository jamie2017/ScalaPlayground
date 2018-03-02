//val number: Option[Int] = Some(3)
//val noNumber: Option[Int] = None
//val result1 = number.map(_ * 1.5)
//val result2 = noNumber.map(_ * 1.5)
//
////result1 should be(Some(4.5))
////result2 should be(None)

val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val result1 = number.fold(1)(_ * 3)
val result2 = noNumber.fold(1)(_ * 3)