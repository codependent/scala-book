package com.codependent.scalabook.matching

object Matching extends App {

  def count(c: Int): Unit = c match {
    case 1 => println("one, a lonely number")
    case x if x == 2 || x == 3 => println("two's company, three's a crowd")
    case x if x > 3 => println("4+, that's a party")
    case _ => println("i'm guessing your number is zero or less")
  }

  count(1)

  val sumFunction: List[Int] => Int = {
    case Nil => 0
    case head :: tail => head + sumFunction(tail)
  }

  val list = List(1, 2, 3, 4)
  println(list.head)
  println(list.tail)
  println(sumFunction(list))

  val valFunc: Any => String = {
    case _: Int => "Int"
    case _: Double => "Double"
    case _ => "Other"
  }

  def defFunc: Any => String = {
    case _: Int => "Int"
    case _: Double => "Double"
    case _ => "Other"
  }

  println(valFunc(1))
  println(defFunc("John"))

}
