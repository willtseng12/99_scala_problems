package com.willtseng12.scala99._01_lists

object P28 {
  def lsort[A](list: List[List[A]]): List[List[A]] = {
    list.sortBy(_.length)
  }

  def lsortFreq[A](list: List[List[A]]): List[List[A]] = {
    var freqLookup = Map[Int, Int]()
    for (l <- list) {
      if (freqLookup contains l.length)
        freqLookup = freqLookup + (l.length -> (freqLookup(l.length) + 1)) else
        freqLookup = freqLookup + (l.length -> 1)
    }
    //    val freqLookup = Map(P10.encode(list.map(_.length).sorted) map {
    //      _.swap
    //    }: _*) // unpack notation
    list.sortBy(l => freqLookup.get(l.length))
  }
}
