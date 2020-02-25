package com.uiftech.scala.itertor

object Test01 {

  def main(args: Array[String]): Unit = {
     test1()
  }

  def test1(): Unit ={
    val it=Iterator("java","c","c++","php")
    while (it.hasNext){
      print(it.next()+",")
    }
  }

  /**
    * 查找最大元素和最小元素
    */
  def test2(): Unit ={
    val ita=Iterator(20,3,5,7,2.1)
    val itb=Iterator(10,4,3,7,1)

    println("最大元素是:"+ita.max)
    println("最小元素是:"+itb.min)
  }
}
