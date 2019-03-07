package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P09Spec extends FunSuite {
  test("empty list") {
    assert(List(List()) == P09.packRecursive(List()))
  }

  test("singleton list") {
    assert(List(List(1)) == P09.packRecursive(List(1)))
  }

  test("generic list of list") {
    assert(List(List(1, 1), List(2, 2, 2), List(1), List(3, 3)) ==
      P09.packRecursive(List(1, 1, 2, 2, 2, 1, 3, 3)))
  }
}
