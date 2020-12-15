package com.uiftech.scala.interfac

class Student(nameI:String,ageI:Int) extends Equal {
  var name:String=nameI
  var age:Int=ageI
  def isEqual(obj: Any)=
    obj.isInstanceOf[Student]&&
    obj.asInstanceOf[Student].name==name
}

object StuTest {

  def main(args: Array[String]): Unit = {
    val stu1=new Student("zhangsan",18)
    val stu2=new Student("lisi",20)
    val stu3=new Student("zhangsan",25)

    println(stu1.isEqual(stu2))

    println(stu1.isEqual(stu3))

    println(stu1.isEqual("zhangsan"))
  }
}
