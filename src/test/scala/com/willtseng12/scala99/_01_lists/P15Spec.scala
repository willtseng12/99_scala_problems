package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P15Spec extends FunSuite {
  test("empty list") {
    assert(List() == P15.duplicateN(2, List()))
  }

  test("singleton list") {
    assert(List('a, 'a, 'a) == P15.duplicateN(3, List('a)))
  }

  test("generic list") {
    assert(List('a, 'a, 'a, 'a, 'b, 'b) == P15.duplicateN(2, List('a, 'a, 'b)))
  }
}
