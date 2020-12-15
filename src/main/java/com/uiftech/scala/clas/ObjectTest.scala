package com.uiftech.scala.clas


/**
  * App类默认带了main函数
  */
object ObjectTest extends App {
    val person=new Employee()
    person.name="lisi"
    person.salary=25000.0
    println(person)
}
