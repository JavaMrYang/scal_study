package com.uiftech.scala.rege

object Demo02 {
  def main(args: Array[String]): Unit = {
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"

    println(pattern replaceFirstIn(str, "Java"))
  }
}
