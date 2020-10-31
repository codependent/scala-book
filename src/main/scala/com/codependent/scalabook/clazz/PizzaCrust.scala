package com.codependent.scalabook.clazz

sealed trait PizzaCrust
case object Thin extends PizzaCrust
case object Normal extends PizzaCrust
case object Thick extends PizzaCrust
