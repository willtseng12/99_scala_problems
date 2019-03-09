package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P14Spec extends FunSuite {
  test("empty list") {
    assert(List() == P14.duplicate(List()))
  }

  test("singleton list") {
    assert(List('a, 'a) == P14.duplicate(List('a)))
  }

  test("generic list") {
    assert(List('a, 'a, 'a, 'a, 'b, 'b) == P14.duplicate(List('a, 'a, 'b)))
  }
}
