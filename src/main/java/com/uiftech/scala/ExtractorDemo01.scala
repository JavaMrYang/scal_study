package com.uiftech.scala

object ExtractorDemo01 {
  def main(args: Array[String]): Unit = {
    println("Apply 方法 : " + apply("Zara", "gmail.com"))
    println("Unapply 方法 : " + unapply("Zara@gmail.com"))
    println("Unapply 方法 : " + unapply("Zara Ali"))
  }

  //注入方法可选
  def apply(username:String,domain:String): String ={
    username+"@"+domain
  }

  // 提取方法（必选）
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2){
      Some(parts(0), parts(1))
    }else{
      None
    }
  }
}
