package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P11Spec extends FunSuite {
  test("singleton list") {
    assert(List('a) == P11.encode(List('a))
    )
  }

  test("generic list") {
    assert(List((2, 'a), (3, 'b), 'a, (2, 'c)) ==
      P11.encode(List('a, 'a, 'b, 'b, 'b, 'a, 'c, 'c)))
  }
}
