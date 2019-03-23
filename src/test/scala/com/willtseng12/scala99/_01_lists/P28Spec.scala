package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P28Spec extends FunSuite {
  test("empty list") {
    assert(Nil == P28.lsort(Nil))
    assert(Nil == P28.lsortFreq(Nil))
  }

  test("generic list") {
    assert(List(List(1), List(3, 4), List(5, 6), List(7, 8, 9)) ==
      P28.lsort(List(List(7, 8, 9), List(3, 4), List(5, 6), List(1))))
    assert(List(List(7, 8, 9), List(1), List(3, 4), List(5, 6)) ==
      P28.lsortFreq(List(List(7, 8, 9), List(3, 4), List(5, 6), List(1))))
  }
}
