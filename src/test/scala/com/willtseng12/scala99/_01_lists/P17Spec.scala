package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P17Spec extends FunSuite {
  test("length of left list is 0") {
    assert((List(), List(1, 2, 3)) == P17.splitRecursive(0, List(1, 2, 3)))
    assert((List(), List(1, 2, 3)) == P17.split(0, List(1, 2, 3)))
  }
  test("length of left list is same as list length") {
    assert((List(1, 2, 3), List()) == P17.splitRecursive(3, List(1, 2, 3)))
    assert((List(1, 2, 3), List()) == P17.split(3, List(1, 2, 3)))
  }
  test("length of left list is larger than list length") {
    assert((List(1, 2, 3), List()) == P17.splitRecursive(4, List(1, 2, 3)))
    assert((List(1, 2, 3), List()) == P17.split(4, List(1, 2, 3)))
  }
  test("length of left list is smaller than list length") {
    assert((List(1, 2), List(3)) == P17.splitRecursive(2, List(1, 2, 3)))
    assert((List(1, 2), List(3)) == P17.split(2, List(1, 2, 3)))
  }
}
