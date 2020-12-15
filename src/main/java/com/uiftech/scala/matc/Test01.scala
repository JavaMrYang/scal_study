package com.uiftech.scala.matc

object Test01 {

  def main(args: Array[String]): Unit = {
    val alice=new Person("Alice",25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for(person<-List(alice,bob,charlie)){
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }

  /**
    * 使用了case关键字的类定义就是就是样例类(case classes)，样例类是种特殊的类，经过优化以用于模式匹配。
    * @param name
    * @param age
    */
  case class Person(name:String,age:Int)
}
