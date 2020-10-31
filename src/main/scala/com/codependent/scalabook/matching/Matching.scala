package com.codependent.scalabook.matching

object Matching extends App {

  def count(c: Int): Unit = c match {
    case 1 => println("one, a lonely number")
    case x if x == 2 || x == 3 => println("two's company, three's a crowd")
    case x if x > 3 => println("4+, that's a party")
    case _ => println("i'm guessing your number is zero or less")
  }

  count(1)

}
