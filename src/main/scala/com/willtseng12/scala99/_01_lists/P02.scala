package com.willtseng12.scala99._01_lists

object P02 {
  def lastButOneRecursive[A](list: List[A]): A = list match {
    case x :: _ :: Nil => x
    case _ :: xs => lastButOneRecursive(xs)
    case _ => throw new NoSuchElementException
  }

  def lastButOneBuiltIn[A](list: List[A]): A = {
    if (list.length < 2) {
      throw new NoSuchElementException
    }
    list.init.last
  }

  def lastButOneBuiltIn2[A](list: List[A]): A = {
    if (list.length < 2) {
      throw new NoSuchElementException()
    }
    list.takeRight(2).head
  }
}
