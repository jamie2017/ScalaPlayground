package week2

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

