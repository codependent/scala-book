package com.codependent.scalabook.concurrent

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureApp extends App {

  val a = Future { Thread.sleep(1*1000); 42 }

  println(a)
  println(a.map(_ * 2))

  Thread.sleep(2000)

  a.onComplete {
    case Failure(exception) => println(exception)
    case Success(value) => println(value)
  }

}
