class Rational(x:Int, y:Int) {
  require(y != 0, "denominator must be nonzero!")
  def this(x:Int) = this(x,1) // a constructor of the class
  private def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a % b)
  def numer = x / gcd(x,y)
  def denom = y / gcd(x,y)

  // This can be advantageous if the functions numer and denum are called often
  // val number = x / gcd(x,y)
  // val denom = y / gcd(x,y)

  // Methods
  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def neg : Rational = new Rational(-numer,denom)
  def sub(that:Rational) = add(that.neg)


  def less(that: Rational) = this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) = if (this.less(that)) that else this

  override def toString = numer + "/" + denom
}

val x = new Rational(1,3)
val y = new Rational(5,7)
val z = new Rational(3,2)
x.numer
y.denom
x.add(y) // x + y
x.sub(y).sub(z) // x - y - z

y.add(y)
x.less(y)
x.max(y)

//val strange = new Rational(1,0)
//strange.add(strange)

new Rational(2)





//------------------
// operation as indicator



def addRational(r:Rational, s:Rational) :Rational =
  new Rational(
    r.numer * s.denom + s.numer * r.denom,
    r.denom * s.denom
  )

def makeString(r:Rational) =
  r.numer + "/" + r.denom

makeString(addRational(new Rational(1,2), new Rational(2,3)))



