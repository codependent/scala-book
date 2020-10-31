package com.codependent.scalabook.clazz

case class Pizza(numberOfIngredients: Int = 1, crust: PizzaCrust = Normal){

  def describe(): String = {
    val description = s"$numberOfIngredients ingredients. $crust crust"
    description
  }

}
