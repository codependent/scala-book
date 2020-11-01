package com.codependent.scalabook.caseclasses

object PersonApp extends App {

  def getPrintableString(p: Person): String = p match {
    case Student(name, year) => s"$name is a student in Year $year."
    case Teacher(name, year, whatTheyTeach) => s"$name in Year $year teaches $whatTheyTeach."
  }

  val t = Teacher("John", 2020, "IT")
  println(getPrintableString(t))

  println(t.copy(name = "Anne"))

  val u = Teacher.unapply(t)
  println(u)
}
