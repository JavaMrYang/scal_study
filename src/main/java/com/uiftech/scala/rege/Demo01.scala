package com.uiftech.scala.rege

import scala.util.matching.Regex

/**
  * 正则表达式的应用
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
      val pattern="Scala".r
      val pattern1 = new Regex("(S|s)cala")  // 首字母可以是大写 S 或小写 s
      val str="Scala is Scalable and cool"
      val str1 = "Scala is scalable and cool"
      println(pattern findFirstIn(str))
      println(str)
      println((pattern1 findAllIn str1))
      println((pattern1 findAllIn str1).mkString(","))
  }

}
