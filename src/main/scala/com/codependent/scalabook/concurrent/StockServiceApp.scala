package com.codependent.scalabook.concurrent

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object StockServiceApp extends App {

  def currentTime = System.currentTimeMillis()
  def deltaTime(t0: Long) = currentTime - t0

  val stockService = new StockServiceImpl()
  // use this to determine the “delta time” below
  val startTime = currentTime

  // (a) create three futures
  val aaplFuture = stockService.getStockPrice("AAPL")
  val amznFuture = stockService.getStockPrice("AMZN")
  val googFuture = stockService.getStockPrice("GOOG")

  // (b) get a combined result in a for-expression
  val result: Future[(Double, Double, Double)] = for {
    aapl <- aaplFuture
    amzn <- amznFuture
    goog <- googFuture
  } yield (aapl, amzn, goog)

  // (c) do whatever you need to do with the results
  result.onComplete {
    case Success(x) => {
      val totalTime = deltaTime(startTime)
      println(s"In Success case, time delta: $totalTime")
      println(s"The stock prices are: $x")
    }
    case Failure(e) => e.printStackTrace()
  }

  Thread.sleep(5000)

}
