package com.willtseng12.scala99._01_lists

object P24 {
  def lotto(n: Int, m: Int): List[Int] = {
    P23.randomSelect(n, (1 to m).toList)
  }

}
