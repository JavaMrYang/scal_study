package com.uiftech.scala.exceptions

import java.io.{FileNotFoundException, FileReader}

/**
  * scala异常捕获
  */
object Test {
  def main(args: Array[String]): Unit = {
      val str=test()
      println(str)
    }
  def test(): Unit ={
    try{
      val f = new FileReader("input.txt")
      println(1)
    }catch {
      case ex:FileNotFoundException=>{
        println("Missing file exception",ex.getMessage)
      }
        println(2)
      case e:RuntimeException=>{
        println("IO Exception",e)
      }
        println(3)
    } finally {
      println("Exiting finally...")
    }
  }
}
