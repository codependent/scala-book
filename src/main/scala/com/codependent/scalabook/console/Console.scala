package com.codependent.scalabook.console

sealed trait Console[A]
final case class Return[A](value: () => A) extends Console[A]
final case class PrintLine[A](line: String, rest: Console[A]) extends Console[A]
final case class ReadLine[A](rest: String => Console[A]) extends Console[A]
