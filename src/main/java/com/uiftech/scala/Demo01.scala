package com.uiftech.scala

object Demo01 {
  def main(args: Array[String]): Unit = {
    print("3+9="+sum(3,9))
    test1()
  }

  def sum(a:Int,b:Int):Int={
    return a+b
  }

  def test1(): Unit ={
    val str=new StringBuffer()
    str.append("abc")
    print(str.toString)
  }
}
