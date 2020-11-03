package com.codependent.scalabook.iteration

object Iterating extends App {

  val map = Map(
    "key1" -> "value1",
    "key2" -> "value2")

  map.foreach{
    entry => println(s"${entry._1}, ${entry._2}")
  }

  map.foreach{
    case (key, value) => println(s"$key, $value")
  }

}
