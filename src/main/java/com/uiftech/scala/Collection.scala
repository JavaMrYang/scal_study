package com.uiftech.scala

/**
  * scala 集合分为四大类List、Set、Map、元组、Option、Iterator
  */
object Collection {

  def main(args: Array[String]): Unit = {
  test2()
  }

  /**
    * List列表定义
    */
  def test1(): Unit ={
    //字符串列表
    val str:List[String]=List("java","c++","php","c#",".net")
    //整形列表
    val str1:List[Int]=List(1,5,8,3,11)
    //空列表
    val str2:List[Nothing]=List()
    //二维列表
    val str3:List[List[Int]]=List(
      List(1,0,0),
      List(2,4,0),
      List(3,0,0)
    )
  }

  /**
    * 列表操作
    */
  def test2(): Unit ={
    val str:List[String]=List("java","c++","php","c#",".net")
    val nums=Nil
    println("列表第一个元素："+str.head)

    println("列表最后一个元素："+str.tail)

    println("列表是否为空："+str.isEmpty)

    println("nums是否为空："+nums.isEmpty)
  }
}
