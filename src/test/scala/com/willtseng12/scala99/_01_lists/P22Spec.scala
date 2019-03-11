package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P22Spec extends FunSuite {
  test("generic range") {
    assert(List(-2, -1, 0, 1, 2) == P22.range(-2, 2))
  }
}
