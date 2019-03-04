package com.willtseng12.scala99._01_lists

import scala.annotation.tailrec

object P08 {
  def compressRecursive[A](list: List[A]): List[A] = {
    @tailrec
    def rec(list: List[A], compressed: List[A] = Nil): List[A] = {
      list match {
        case x :: xs => rec(list.dropWhile(_ == x), x :: compressed)
        case Nil => compressed.reverse
      }
    }

    rec(list)
  }

  def compress[A](list: List[A]): List[A] = {
    list.foldRight(List[A]()) { (x, xs) => if (xs.isEmpty || x != xs.head) x :: xs else xs }
  }
}
