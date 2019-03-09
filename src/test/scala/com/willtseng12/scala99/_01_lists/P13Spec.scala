package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P13Spec extends FunSuite {
  test("singleton list") {
    assert(List((1, 'a)) == P13.encodeDirect(List('a)))
  }

  test("generic list") {
    assert(List((2, 'a), (3, 'b), (1, 'a), (2, 'c)) ==
      P13.encodeDirect(List('a, 'a, 'b, 'b, 'b, 'a, 'c, 'c)))
  }
}
