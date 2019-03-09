package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P10Spec extends FunSuite {

  test("singleton list") {
    assert(List((1, 'a)) == P10.encode(List('a)))
  }

  test("generic list") {
    assert(List((2, 'a), (3, 'b), (1, 'a), (2, 'c)) ==
      P10.encode(List('a, 'a, 'b, 'b, 'b, 'a, 'c, 'c)))
  }
}
