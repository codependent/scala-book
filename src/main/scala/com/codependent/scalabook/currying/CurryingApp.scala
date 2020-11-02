package com.codependent.scalabook.currying

object CurryingApp extends App {

  def divisible(mod: Int)(num: Int) = {
    num % mod
  }

  val divisibleBy2 = divisible(2) _

  println(divisibleBy2(14))
  println(divisibleBy2(15))

  def divisibleBis(mod: Int) = (num: Int) => num % mod

  val divisibleBy2Bis = divisibleBis(2)

  println(divisibleBy2Bis(14))
  println(divisibleBy2Bis(15))


}
