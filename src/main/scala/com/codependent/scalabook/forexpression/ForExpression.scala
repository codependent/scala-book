package com.codependent.scalabook.forexpression

object ForExpression extends App {

  val nums = List(1, 4, 3, 2)

  val doubled = nums.map(_ * 2)
  println(doubled)

  val doubled2 = for (n <- nums) yield n * 2
  println(doubled2)

  val names = List("_adam", "_david", "_frank")
  val capitalizedNames = for (name <- names) yield name.drop(1).capitalize
  println(capitalizedNames)

}
