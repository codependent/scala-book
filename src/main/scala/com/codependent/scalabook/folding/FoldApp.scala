package com.codependent.scalabook.folding

import com.codependent.scalabook.clazz.Person

object FoldApp extends App {

  def getFromCache(id: Int): Option[Person] = {
    if (id % 2 == 0) {
      Some(Person(id.toString, id.toString))
    } else {
      None
    }
  }

  def getFromDatabase(id: Int): Option[Person] = {
    if (id % 3 == 0) {
      Some(Person(id.toString, id.toString))
    } else {
      None
    }
  }

  def get(id: Int): Option[Person] = {
    //getFromCache(id).fold(getFromDatabase(id))(identity(Option(_)))
    getFromCache(id).orElse(getFromDatabase(id))
  }

  println(get(2))
  println(get(3))
  println(get(1))

}
