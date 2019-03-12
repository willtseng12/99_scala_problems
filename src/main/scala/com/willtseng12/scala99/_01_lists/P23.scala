package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P23 {
  def randomSelect[A](n: Int, list: List[A]): List[A] = {

    @tailrec
    def rec(n: Int, list: List[A], selected: List[A] = Nil, random: util.Random = util.Random): List[A] = {
      if (n <= 0 || list.isEmpty) selected
      else {
        val (xs, x) = P20.removeAt(random.nextInt(list.length), list)
        rec(n - 1, xs, x :: selected)
      }
    }

    rec(n, list)
  }
}
