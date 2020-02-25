package com.uiftech.scala.array

object Array_Test02 {

  def main(args: Array[String]): Unit = {
      test1()
  }

  def test1(): Unit ={
    val arr=Array.ofDim[Int](3,3)
    // 创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        arr(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + arr(i)(j));
      }
      println();
    }
  }
}
