package com.codependent.scalabook.nonnull

import scala.util.Try

object NonNull extends App {

  val toInt = (s: String) => {
    try {
      Integer.parseInt(s.trim)
    } catch {
      case _: Exception => 0
    }
  }

  println(toInt)
  println(toInt("1234"))
  println(toInt("a"))

  def defToInt(s: String) = {
    try {
      Integer.parseInt(s.trim)
    } catch {
      case _: Exception => 0
    }
  }

  println(defToInt("1234"))
  println(defToInt("a"))

  val toIntOption = (s: String) => {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case _: Exception => None
    }
  }

  println(toIntOption)
  println(toIntOption("1234"))
  println(toIntOption("a"))

  def defToIntOption(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case _: Exception => None
    }
  }

  println(defToIntOption("1234"))
  println(defToIntOption("a"))

  defToIntOption("as") match {
    case Some(value) => value
    case None => println("Nothing!")
  }

  val result = for {
    a <- toIntOption("1")
    b <- toIntOption("2")
    c <- toIntOption("3")
  } yield a + b + c

  println(result)

  val result2 = toIntOption("1")
    .flatMap(a => toIntOption("2")
      .flatMap(b => toIntOption("3")
        .flatMap(c => Some(a + b + c))))

  println(result2)

  val result3 = for {
    a <- toIntOption("1")
    b <- toIntOption("2")
    c <- toIntOption("a")
  } yield a + b + c

  println(result3)

  toIntOption("1").foreach(println)
  toIntOption("x").foreach(println)

  val tryToInt = (s: String) => Try(Integer.parseInt(s))

  println(tryToInt("1"))
  println(tryToInt("s"))

}
