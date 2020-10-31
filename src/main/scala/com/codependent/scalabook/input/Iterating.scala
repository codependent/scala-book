package com.codependent.scalabook.input

object Iterating extends App {

  val map = Map(
    "key1" -> "value1",
    "key2" -> "value2")

  map.foreach({
    entry => println(s"${entry._1}, ${entry._2}")
  })

}
