  def combine(resArray:ArrayBuffer[String], res: String, array: Array[String], l: Int): Unit = {
    if (l == 0) {
      resArray += res
      return
    }

    for(i <- 0 to array.length - l) {
      val newRes = if (res == "") array(i) else res + "\t" + array(i)
      combine(resArray, newRes, array.slice(i + 1, array.length), l-1)
    }
  }
