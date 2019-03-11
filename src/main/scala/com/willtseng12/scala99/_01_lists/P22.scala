package com.willtseng12.scala99._01_lists

object P22 {
  def range(start: Int, end: Int): List[Int] = {
    if (start > end) return Nil
    start :: range(start + 1, end)
  }
}
