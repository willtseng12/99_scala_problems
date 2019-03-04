package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P03Spec extends FunSuite {
  test("length of list is less or equal to k") {
    intercept[NoSuchElementException] {
      P03.kthElementRecursive(3, List(1, 2, 3))
    }
  }
  test("generic list: length of list is greater than k") {
    assert(2 == P03.kthElementRecursive(1, List(1, 2, 3)))
  }
}
