package com.willtseng12.scala99._01_lists

import java.util.NoSuchElementException

object P20 {
  def removeAt[A](k: Int, list: List[A]): (List[A], A) = {
    list.splitAt(k) match {
      case (y, x :: xs) if k >= 0 => (y ++: xs, x)
      case (Nil, _) => throw new NoSuchElementException()
      case (_, Nil) => throw new NoSuchElementException()
    }
  }

}
