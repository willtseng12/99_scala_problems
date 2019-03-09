package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P12Spec extends FunSuite {
  test("singleton list") {
    assert(List('a) == P12.decode(List((1, 'a))))
  }

  test("generic list") {
    assert(List('a, 'a, 'b, 'b, 'b, 'a, 'c, 'c) ==
      P12.decode(List((2, 'a), (3, 'b), (1, 'a), (2, 'c))))
  }
}
