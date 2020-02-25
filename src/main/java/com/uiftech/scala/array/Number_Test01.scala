package com.uiftech.scala.array

object Number_Test01 {
  def main(args: Array[String]): Unit = {
    val array=Array(1,4,2,7,5,13,12,78)
    //test1(array)
    test2(array)
    test3(array)
  }

  /**
    * 输出所有数组元素
    */
  def test1(array: Array[Int]): Unit ={
    for(a<- array){
      print(array(a)+",")
    }
  }

  /**
    * 输出数组的总和并打印
    * @param array
    */
  def test2(array: Array[Int]): Unit ={
    val str=new StringBuffer()
    var total=0
    for(a<-0 to (array.length-1)){
      total+=array(a)
      str.append(array(a)).append("+")
    }
    str.deleteCharAt(str.length()-1).append("=").append(total)
    println(str)
  }

  /**
    * 查找数组中的最大元素
    * @param array
    */
  def test3(array: Array[Int]): Unit ={
    var max=array(0)
    for(i<-0 to (array.length-1)){
      if(max<array(i)) max=array(i)
    }
    println("数组array的最大值为:"+max)
  }
}
