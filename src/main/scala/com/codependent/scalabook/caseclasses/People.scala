package com.codependent.scalabook.caseclasses

case class Student(name: String, year: Int) extends Person
case class Teacher(name: String, year: Int, specialty: String) extends Person
