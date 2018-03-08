val nums = Array(1,2,3,4,5)

val res = nums.combinations(3)
res.next

res.foreach(a => println(a.mkString(", ")))

res.hasNext

val arr0 = Array.tabulate(15)(i=>i)

arr0.grouped(3).foreach(a => println(a.mkString(", ")))

arr0.grouped(4).foreach(a => println(a.mkString(", ")))

nums.inits.foreach(a => println(a.mkString(", ")))
nums.tails.foreach(a => println(a.mkString(", ")))

nums.permutations.foreach(a => println(a.mkString(", ")))

nums.sliding(3).foreach(a => println(a.mkString(", ")))

