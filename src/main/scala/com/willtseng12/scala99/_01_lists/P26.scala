package com.willtseng12.scala99._01_lists

object P26 {
  def combinations[A](k: Int, list: List[A]): List[List[A]] = {
    list match {
      case Nil => Nil
      case x :: xs if k == 1 => list.map(List(_))
      case x :: xs => combinations(k - 1, xs).map(x :: _) ::: combinations(k, xs)
    }
  }
}
