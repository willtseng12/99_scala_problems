package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P05 {
  def reverseBuiltIn[A](list: List[A]): List[A] = list.reverse

  def reverseRecursive[A](list: List[A]): List[A] = {

    @tailrec
    def rec(list: List[A], reverseList: List[A] = Nil): List[A] = {
      (list.length, list) match {
        case (_, Nil) => reverseList
        case (_, x :: xs) => rec(xs, x :: reverseList)
      }
    }

    rec(list)
  }
}
