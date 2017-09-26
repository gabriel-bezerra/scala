object X {
  trait F
  trait G extends F
  trait H extends F
  trait I extends G with H

  case class D[A]()
  //type Con[Z] = D[_ >: Z]

  //val xs = Seq(D[Int](), D[Boolean]())
  val ys = Seq(D[G](), D[H]())

  //def g[Y](is: Seq[_ >: Y]) = ???
  def g[Y](is: Seq[D[_ >: Y]]) = ???
  def f[Z](is: Seq[_ >: Z]) = ???

  f(ys)
  g(ys)
  //g[J](ys)
}
