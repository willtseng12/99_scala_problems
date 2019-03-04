package com.willtseng12.scala99._01_lists

import java.util.NoSuchElementException

object P01 {

  def lastBuiltIn[A](list: List[A]): A = {
    list.last
  }

  def lastRecursive[A](list: List[A]): A = {
    list match {
      case x :: Nil => x
      case _ :: xs => lastRecursive(xs)
      case _ => throw new NoSuchElementException()
    }
  }
}
