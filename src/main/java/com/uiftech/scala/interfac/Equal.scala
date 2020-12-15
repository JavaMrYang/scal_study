package com.uiftech.scala.interfac

/**
  * Scala Trait(特征) 相当于 Java 的接口，实际上它比接口还功能强大。
  *
  * 与接口不同的是，它还可以定义属性和方法的实现。
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}
