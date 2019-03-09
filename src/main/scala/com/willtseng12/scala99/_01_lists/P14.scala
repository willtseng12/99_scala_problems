package com.willtseng12.scala99._01_lists

object P14 {
  def duplicate[A](list: List[A]): List[A] = {
    list.flatMap(x => List(x, x))
  }
}
