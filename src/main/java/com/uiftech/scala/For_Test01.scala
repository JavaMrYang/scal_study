package com.uiftech.scala

/**
  * scala for循环语法
  * for( var x <- Range ){
  * statement(s);
  * }
  * Range 可以是一个数字区间表示 i to j ，或者 i until j。左箭头 <- 用于为变量 x 赋值。
  */
object For_Test01 {
  def main(args: Array[String]): Unit = {
    //test1()
    test3()
  }

  /**
    * test until语法
    */
  def test1(): Unit ={
    var a=0;
    for(a<-1 until(10)){
      println("Value of is "+a)
    }
  }

  /**
    * test 双重for循环代码
    */
  def test2(): Unit ={
    var a=0;
    var b=0;

    for(a<-1 to 3;b<-1 to 4){
      print("a:"+a+","+"b:"+b+"\n")
    }
  }

  /**
    * 写一个九九乘法表
    */
  def test3(): Unit ={
    var a=1
    for(a<-1 to 9){
      for(b<-1 to a){
        print(a+"*"+b+"="+a*b+"\t");
      }
      println()
    }
  }
}
