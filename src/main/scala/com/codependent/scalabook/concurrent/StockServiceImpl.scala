package com.codependent.scalabook.concurrent

import java.lang.Thread.sleep

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class StockServiceImpl extends StockService {

  override def getStockPrice(stock: String): Future[Double] = Future {
    val r = scala.util.Random
    val randomSleepTime = r.nextInt(3000)
    println(s"For $stock, sleep time is $randomSleepTime")
    val randomPrice = r.nextDouble * 1000
    sleep(randomSleepTime)
    randomPrice
  }

}
