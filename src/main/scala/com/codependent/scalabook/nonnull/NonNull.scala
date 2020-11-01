package com.codependent.scalabook.nonnull

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

  def defToInt(s : String) = {
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

  println(result)

}
