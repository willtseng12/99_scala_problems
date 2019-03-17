package com.willtseng12.scala99._01_lists

object P25 {
  def randomPermute[A](list: List[A]): List[A] = {
    P23.randomSelect(list.length, list)
  }
}
