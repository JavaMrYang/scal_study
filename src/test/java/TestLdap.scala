object TestLdap {

  def main(args: Array[String]): Unit = {
      test("hadoop")
  }

  def test(uid:String): Unit ={
    val bindDN = "uid="+uid+",cn=user,cn=accounts,dc=sit,dc=bcs"
    println(bindDN)
  }
}
