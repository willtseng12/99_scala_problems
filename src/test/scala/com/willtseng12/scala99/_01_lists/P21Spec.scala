package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P21Spec extends FunSuite {
  test("insert at index less than 0") {
    assert(List(0, 1, 2, 3) == P21.insertAt(0, -1, List(1, 2, 3)))
  }
  test("insert at index greater than list length") {
    assert(List(1, 2, 3, 0) == P21.insertAt(0, 5, List(1, 2, 3)))
  }
  test("insert at index between 0 and list length") {
    assert(List(1, 2, 0, 3) == P21.insertAt(0, 2, List(1, 2, 3)))
  }
}
