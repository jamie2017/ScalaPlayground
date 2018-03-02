def sum(f:Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)


def sumInt(a:Int, b:Int) = sum(id,a,b)
def sumCubes(a:Int, b:Int) = sum(cube,a,b)
def sumFactorials(a:Int, b:Int) = sum(fact,a,b)

def id(x:Int):Int = x
def cube(x:Int): Int = x * x * x
def square(x:Int): Int = x * x

def fact(x:Int):Int = if(x == 0) 1 else x * fact(x - 1)
fact(4)


// Anonymous Functions

def sumInts2(a:Int,b:Int) = sum(x => x, a, b)
def sumCubes2(a:Int,b:Int) = sum(x => x * x * x, a, b)

def sum1(a:Int,b:Int) = sum(x => x * x, a, b)

sum1(1,10)

def sum2(f:Int => Int, a:Int, b:Int) = {
  def loop(a:Int, acc:Int) : Int =
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  loop(a,0)
}
sum2(x => x * x, 1,10)
sum2(square,1,10)
sum2(x => x * x,3,5)
// 3*3 + 4*4 + 5*5


// Currying

def sum3(f:Int=>Int)(a:Int,b:Int):Int =
  if (a > b)0
  else f(a) + sum3(f)(a + 1,b)

sum3(square)(1,10)


def product(f:Int => Int)(a:Int, b:Int):Int =
  if (a > b) 1
  else f(a) * product(f)(a + 1, b)

product(x => x * x)(3,4) // (3 * 3) * (4 * 4)

def fact2(n:Int) = product(x => x)(1,n)
fact(5) == fact2(5)




// More general version of sum and product

def mapReduce(f:Int => Int, combine: (Int, Int) => Int,zero:Int)(a:Int, b:Int):Int =
  if(a > b) zero
  else combine(f(a), mapReduce(f, combine,zero)(a + 1, b))


def product_mr(f:Int => Int)(a:Int, b:Int):Int = mapReduce(f,(x,y) => x * y,1)(a,b)

product_mr(x => x * x)(3,4)


def sum_mr(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,(x,y) => x + y,0)(a,b)
sum_mr(square)(1,10)
sum3(square)(1,10)



