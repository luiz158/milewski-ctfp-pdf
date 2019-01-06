sealed trait RingF[+A]
case object RZero extends RingF[Nothing]
case object ROne extends RingF[Nothing]
final case class RAdd[A](m: A, n: A) extends RingF[A]
final case class RMul[A](m: A, n: A) extends RingF[A]
final case class RNeg[A](n: A) extends RingF[A]