package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P10 {
  def encodeRecursive[A](list: List[A]): List[(Int, A)] = {
    @tailrec
    def rec(list: List[A], encodedList: List[(Int, A)] = List()): List[(Int, A)] = {
      list match {
        case x :: xs => rec(list.dropWhile(_ == x), (list.takeWhile(_ == x).length, x) :: encodedList)
        case Nil => encodedList.reverse
      }
    }

    rec(list)
  }

  def encode[A](ls: List[A]): List[(Int, A)] =
    P09.packRecursive(ls) map { e => (e.length, e.head) }
}
