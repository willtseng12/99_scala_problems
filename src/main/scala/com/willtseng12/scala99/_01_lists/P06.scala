package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P06 {
  def isPalindrome[A](list: List[A]): Boolean = {
    if (list.isEmpty) return true

    @tailrec
    def rec(list: List[A], i: Int = 0, j: Int = list.length - 1): Boolean = {
      (j - i <= 1, list(i) == list(j)) match { // final case: even: j - i == 1, odd: j - i = 0
        case (true, true) => true
        case (false, true) => rec(list, i + 1, j - 1)
        case (_, false) => false
      }
    }

    rec(list)
  }
}
