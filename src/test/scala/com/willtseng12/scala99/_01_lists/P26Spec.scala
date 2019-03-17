package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P26Spec extends FunSuite {
  test("empty list") {
    assert(P26.combinations(3, Nil).isEmpty)
  }

  test("0 element") {
    assert(Nil == P26.combinations(0, List(1, 2, 3)))
  }

  test("1 element") {
    assert(List(List(1), List(2), List(3)) == P26.combinations(1, List(1, 2, 3)))
  }
  
  test("more than 1 elements") {
    assert(List(List(1, 2), List(1, 3), List(2, 3)) == P26.combinations(2, List(1, 2, 3)))
  }
}
