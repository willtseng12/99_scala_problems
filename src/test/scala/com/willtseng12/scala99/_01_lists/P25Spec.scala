package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P25Spec extends FunSuite {
  test("empty list") {
    assert(0 == P25.randomPermute(List()).distinct.length)
    assert(0 == P25.randomPermuteFY(List()).distinct.length)
  }
  test("singleton list") {
    assert(1 == P25.randomPermute(List(1)).distinct.length)
    assert(1 == P25.randomPermuteFY(List(1)).distinct.length)
  }
  test("generic list") {
    assert(5 == P25.randomPermute(List(1, 2, 3, 4, 5)).distinct.length)
    assert(5 == P25.randomPermuteFY(List(1, 2, 3, 4, 5)).distinct.length)
  }
}
