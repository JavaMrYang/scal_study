package com.uiftech.scala.clas

class Person {
    var name=""

    override def toString=getClass.getName+"[name="+name+"]"
}

class Employee extends Person{
  var salary:Double=0.0

  override def toString: String = super.toString+"[salary="+salary+"]"
}


