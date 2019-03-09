package com.willtseng12.scala99._01_lists

object P13 {
  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    P10.encodeRecursive(list)
  }
}
