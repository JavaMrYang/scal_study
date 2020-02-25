package com.uiftech.scala.array

object Array_Test03 {

  def main(args: Array[String]): Unit = {
    //test1()
    test2()
  }

  /**
    * 范围数组Array.range
    */
  def test1(): Unit ={
    val a=Array.range(10,20,2)
    val b=Array.range(10,20)
    for(i<-a){
      print(i+",")
    }
    println()
    for(i<-b){
      print(i+",")
    }
  }

  /**
    * 数组拼接
    */
  def test2(): Unit ={
    /*val a1="java"::("php"::("c++"::Nil))
    val a2="c"::(".net"::Nil)*/
    val a1=List("java","php","c++")
    val a2=List("c",".net")

    val arr=List.concat(a1,a2)

    println(a1)
    println(a2)
    println(arr)
  }


}
