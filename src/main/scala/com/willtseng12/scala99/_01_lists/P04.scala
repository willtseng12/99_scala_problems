package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P04 {
  def lengthBuiltIn[A](list: List[A]): Int = list.length

  def lengthRecursive[A](list: List[A]): Int = {

    @tailrec
    def rec(list: List[A], i: Int = 0): Int = list match {
      case Nil => i
      case _ :: xs => rec(xs, i + 1)
    }

    rec(list)
  }
}
