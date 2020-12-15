package com.uiftech.scala.matc

object MatchTest {
  def main(args: Array[String]): Unit = {
   // println(matchTest(3))

    println(matchTest2("two"))
    println(matchTest2("test"))
    println(matchTest2(1))
    println(matchTest2(6))

  }
  def matchTest(x:Int)=x match {
    case 1=>"one"
    case 2=>"two"
    case _=>"many"
  }

  /**
    * _代表·任意字符
    * @param x
    * @return
    */
  def matchTest2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"+y
    case _ => "many"
  }
}
