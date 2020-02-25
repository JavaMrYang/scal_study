package com.uiftech.scala

/**
  * scala var是可以重新赋值修改的 val不可改变的
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val str:String="foo"
    println(str)
    println("Hello,world!")
   // test()
    test2()
  }

  def test(): Unit ={
    var a=true
    var b=false

    println("a&&b="+(a&&b))
    println("a||b="+(a||b))
    println("!a&&b="+ !(a&&b))
  }

  def test2(): Unit ={
    var a = 10
    val b = 20
    var c = 0
    c = a + b
    println("c = a + b  = " + c)
    c += a
    println("c += a  = " + c)
    c -= a
    println("c -= a = " + c)
    c *= a
    println("c *= a = " + c)
    a = 10
    c = 15
    c /= a
    println("c /= a  = " + c)
    a = 10
    c = 15
    c %= a
    println("c %= a  = " + c)
    c <<= 2
    println("c <<= 2  = " + c)
    c >>= 2
    println("c >>= 2  = " + c)
    c >>= a
    println("c >>= a  = " + c)
    c &= a
    println("c &= 2  = " + c)

    c ^= a
    println("c ^= a  = " + c)

    c |= a
    println("c |= a  = " + c)
  }
}
