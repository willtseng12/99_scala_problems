package com.willtseng12.scala99._01_lists

object P19 {
  def rotate[A](n: Int, list: List[A]): List[A] = {
    val section = list.splitAt((n + list.length) % list.length)
    section._2 ++: section._1
  }
}
