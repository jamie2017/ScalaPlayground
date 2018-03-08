val a = Array(5,2,9,3,1,8,6)

// reduceLeft
a.reduceLeft(_ + _) == a.sum
a.reduceLeft((a,b) => {println(a + ", " + b); a + b})
a.reduceRight((a,b) => {println(a + ", " + b); a + b})


// foldLeft
a.foldLeft(0)(_ + _)
a.foldLeft("")(_ + _)
a.foldLeft("")(_ + _+",")

