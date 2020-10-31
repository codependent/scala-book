package com.codependent.scalabook.forexpression

object ForExpression extends App {

  val nums = List(1, 4, 3, 2)

  val doubled = nums.map(_ * 2)
  println(doubled)

  val doubled2 = for (n <- nums) yield n * 2
  println(doubled2)

}
