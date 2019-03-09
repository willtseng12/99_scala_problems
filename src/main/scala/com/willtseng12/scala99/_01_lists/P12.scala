package com.willtseng12.scala99._01_lists

object P12 {
  def decode[A](list: List[(Int, A)]): List[A] = {
    list.flatMap(x => List.fill(x._1)(x._2))
  }
}
