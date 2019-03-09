package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P18Spec extends FunSuite {
  test("generic list with slice index in bound") {
    assert(List(2, 3) == P18.slice(1, 3, List(1, 2, 3, 4)))
    assert(List(2, 3) == P18.sliceBuiltIn(1, 3, List(1, 2, 3, 4)))
  }
  test("generic list with slice index out of bound") {
    assert(List(1, 2, 3, 4) == P18.slice(-1, 5, List(1, 2, 3, 4)))
    assert(List(1, 2, 3, 4) == P18.sliceBuiltIn(-1, 5, List(1, 2, 3, 4)))
  }
}
