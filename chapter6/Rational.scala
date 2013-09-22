class Rational(n: Int, d:Int) {
  // precondition
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  // auxiliary constructors
  def this(n:Int) = this(n, 1)

  // override keyword
  override def toString = numer + "/" + denom

  private def gcd(a: Int, b:Int): Int = 
    if (b == 0) a else gcd(b, a%b)

  def +(that: Rational): Rational = 
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  def +(i:Int): Rational = 
    new Rational(numer + i * denom, denom)

  def -(that:Rational): Rational = 
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  def -(i:Int): Rational = 
    new Rational(numer - i * denom, denom)

  def *(that:Rational): Rational = 
    new Rational(numer * that.numer, denom * that.denom)
  def *(i:Int): Rational = 
    new Rational(numer * i, denom)

  def /(that:Rational): Rational = 
    new Rational(numer * that.denom, denom * that.numer)
  def /(i:Int): Rational =
    new Rational(numer, denom * i)

  def lessThan(that: Rational): Boolean = 
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational): Rational = 
    if (this.lessThan(that)) that else this
}


// implicit conversions
// implicit def intToRational(x: Int) = new Rational(x)


