package com.willtseng12.scala99._01_lists

object P21 {
  def insertAt[A](x: A, k: Int, list: List[A]): List[A] = {
    list.splitAt(k) match {
      case (pre, post) => pre ::: x :: post
    }
  }
}
