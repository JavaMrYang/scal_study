package com.uiftech.scala.fil

import java.io.{File, PrintWriter}

object FileTest {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("菜鸟教程")
    writer.close()
  }
}
