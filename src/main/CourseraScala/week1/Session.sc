object session{
  1 + 3
  def abs(x: Double) = if (x < 0) -x else x



  def sqrt(x:Double) = {

    def sqrtIter(guess: Double) : Double =
      if (isGoodEnoughOpt(guess)) guess
      else sqrtIter(improve(guess))

    // This implemetation is not very precise for small number (1e-20)
    // Also can lead to non-termination for very large numbers
    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) < 0.001

    def isGoodEnoughOpt(guess: Double) =
      abs(guess * guess - x) / x < 0.001


    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }


  sqrt(2)
  sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)


  def gcd(a:Int, b:Int): Int =
    if(b == 0) a else gcd(b, a % b)


  gcd(21,14)

  def factorial(n:Int) : Int =
    if (n == 0) 1 else n * factorial(n - 1)

  factorial(4)

  def factorial2(n:Int): Int = {
    def loop(acc: Int, n:Int):Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1,n)
  }

  factorial(2) == factorial2(2)
  factorial(5) == factorial2(5)
  factorial(20) == factorial2(20)
  factorial(7) == factorial2(7)




  def fibonacci(n:Int): Int =
    if (n <= 0)
      -1
    else
      if (n == 1 || n == 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)

  fibonacci(1)
  fibonacci(2)
  fibonacci(3)
  fibonacci(4)
  fibonacci(5)
  fibonacci(6)
  fibonacci(7)
  fibonacci(8)
  fibonacci(-32)

}