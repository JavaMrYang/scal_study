package com.uiftech.scala.clas

class Point(xc:Int,xy:Int){
  var x:Int=xc
  var y:Int=xy

  def move(dx:Int,dy:Int): Unit ={
    x=x+dx
    y=y+dy

    println("x 的坐标点:"+x)
    println("y 的坐标点:"+this.y)
  }
}
object Point_Test {
  def main(args: Array[String]): Unit = {
    val p=new Point(3,5);
    //p.move(6,2)
    /**
      * 单例对象
      */
    printPoint

    def printPoint: Unit ={
      println("x 的坐标点;"+p.x)
      println("y 的坐标点:"+p.y)
    }
  }
}
