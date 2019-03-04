package com.willtseng12.scala99._01_lists

import java.util.NoSuchElementException

object P03 {
  def kthElementRecursive[A](k: Int, list: List[A]): A = {
    (k, list) match {
      case (0, xs) => xs.head
      case (_, _ :: xs) => kthElementRecursive(k - 1, xs)
      case (_, Nil) => throw new NoSuchElementException()
    }
  }

  def kthElementBuiltIn[A](k: Int, list: List[A]): A = {
    if (k > list.length) throw new NoSuchElementException()
    list(k)
  }
}


