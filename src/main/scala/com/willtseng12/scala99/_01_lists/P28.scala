package com.willtseng12.scala99._01_lists

object P28 {
  def lsort[A](list: List[List[A]]): List[List[A]] = {
    list.sortBy(_.length)
  }

  //  def lsort[A](list: List[List[A]]): List[List[A]] = {
  //    val freqLookup = Map[]()
  //    for {l <- list
  //         if freqLookup contains l.length}
  //      freqLookup + (l.length -> freqLookup(l.length) + 1)
  //  }
}
