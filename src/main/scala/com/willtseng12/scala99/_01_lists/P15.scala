package com.willtseng12.scala99._01_lists

object P15 {
  def duplicateN[A](N: Int, list: List[A]): List[A] = {
    list.flatMap(x => List.fill(N)(x))
  }
}
