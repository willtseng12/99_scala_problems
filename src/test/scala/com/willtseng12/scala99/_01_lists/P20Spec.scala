package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P20Spec extends FunSuite {
  test("k less than 0") {
    intercept[NoSuchElementException] {
      P20.removeAt(-1, List(1, 2, 3))
    }
  }
  test("k greater than equal to 0 and less than list length") {
    assert((List(2, 3), 1) == P20.removeAt(0, List(1, 2, 3)))
  }

  test("k greater than equal to list length") {
    intercept[NoSuchElementException] {
      P20.removeAt(3, List(1, 2, 3))
    }
  }
}
