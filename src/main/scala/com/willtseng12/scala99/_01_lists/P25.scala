package com.willtseng12.scala99._01_lists

object P25 {
  def randomPermute[A](list: List[A]): List[A] = {
    P23.randomSelect(list.length, list)
  }

  def randomPermuteFY[A](list: List[A]): List[A] = {
    val ar = list.toBuffer
    val rand = new util.Random

    for (i <- list.length - 1 to 1 by -1) {
      val index = rand.nextInt(i)
      val temp = ar(index)
      ar.update(index, ar(i))
      ar.update(i, temp)
    }
    ar.toList
  }
}
