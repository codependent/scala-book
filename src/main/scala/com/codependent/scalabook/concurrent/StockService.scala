package com.codependent.scalabook.concurrent

import scala.concurrent.Future

trait StockService {

  def getStockPrice(stock: String) : Future[Double] = ???

}
