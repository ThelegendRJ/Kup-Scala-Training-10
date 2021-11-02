package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec
class HoFTest extends AnyFlatSpec {
  val obj = new HigherOrderFunction()
  val list = List(3,5,7,9,11)

  "Condition" should "return nothing is List is empty" in {
    assert(obj.squareList(List()) == Nil)
  }

  "Condition" should "The Squaring of the list is working correctly" in {
    assert(obj.squareList(list) == List(9, 25, 49, 81, 121))
  }

  "condition" should "The Squaring of the list elements is working properly by mapping " in {
    assert(obj.squareListMapper(list) == List(9, 25, 49, 81, 121))
  }

  "condition" should "Both returns same list "in{
    assert(obj.squareListMapper(list) == obj.squareList(list) )
  }

  "Condition" should "Giving False if the List isn't the same as the Squared list" in {
    assert(obj.squareList(list) !== List(9,25,49))
  }

}

