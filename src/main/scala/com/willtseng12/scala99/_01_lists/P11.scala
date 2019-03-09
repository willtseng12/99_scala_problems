package com.willtseng12.scala99._01_lists

object P11 {
  def encode[A](list: List[A]): List[Any] = {
    P10.encode(list).map(x => if (x._1 < 2) x._2 else x)
  }
}
