package com.uiftech.scala.array

object Demo01 {

  def main(args: Array[String]): Unit = {
    var z:Array[String]=new Array[String](3);
    z(0)="a";z(1)="ds";z(2)="n"
    for(i<-0 to (z.length-1)){
        print("数组z的第"+(i+1)+"个元素是:"+z(i)+"\n")
    }
  }
}
