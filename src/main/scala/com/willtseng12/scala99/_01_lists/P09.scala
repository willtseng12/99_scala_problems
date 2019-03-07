package com.willtseng12.scala99._01_lists

object P09 {
  def packRecursive[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) return List(List())

    def rec(list: List[A], groupList: List[List[A]] = List()): List[List[A]] = {
      list match {
        case x :: xs => rec(list.dropWhile(_ == x), list.takeWhile(_ == x) +: groupList)
        case Nil => groupList.reverse
      }
    }

    rec(list)
  }

}
