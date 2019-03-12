package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P17 {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    list.splitAt(n)
  }

  def splitRecursive[A](n: Int, list: List[A]): (List[A], List[A]) = {

    @tailrec
    def rec(n: Int, list: List[A], leftList: List[A] = Nil): (List[A], List[A]) = {
      list match {
        case x :: xs => if (leftList.length < n) rec(n, xs, x :: leftList) else
          (leftList.reverse, list)
        case Nil => (leftList.reverse, list)
      }
    }

    rec(n, list)
  }
}
