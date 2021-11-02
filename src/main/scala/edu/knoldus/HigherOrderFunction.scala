package edu.knoldus

class HigherOrderFunction {
  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => Nil
      case y :: ys => y * y :: squareList(ys)
    }


  def squareListMapper(xs: List[Int]): List[Int] =
    xs map(x => x * x)
}

object main extends App {

  val obj = new HigherOrderFunction()
  val list = List(2,4,6,8,10,12)
  println(obj.squareList(list))
  println(obj.squareListMapper(list))
}