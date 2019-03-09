package com.willtseng12.scala99._01_lists

object P18 {
  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
    list.zipWithIndex.filter(x => (x._2 >= start) & (x._2 < end)).map(_._1)
  }

  def sliceBuiltIn[A](start: Int, end: Int, list: List[A]): List[A] = {
    list.slice(start, end)
  }
}
