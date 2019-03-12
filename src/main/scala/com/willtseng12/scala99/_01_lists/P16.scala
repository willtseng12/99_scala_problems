package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P16 {
  def drop[A](N: Int, list: List[A]): List[A] = {
    list.zipWithIndex.filterNot(x => (x._2 + 1) % N == 0).map(_._1)
  }

  def dropRecursive[A](N: Int, list: List[A]): List[A] = {

    @tailrec
    def rec(list: List[A], filteredList: List[A], currentIndex: Int = 0): List[A] = {
      list match {
        case x :: xs => if ((currentIndex + 1) % N != 0) rec(xs, x :: filteredList, currentIndex + 1) else
          rec(xs, filteredList, currentIndex + 1)
        case Nil => filteredList.reverse
      }
    }

    rec(list, Nil)
  }
}
