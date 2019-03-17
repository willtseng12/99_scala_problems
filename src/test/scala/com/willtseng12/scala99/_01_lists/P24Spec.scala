package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P24Spec extends FunSuite {
  test("n greater than 0") {
    assert(P24.lotto(3, 10).distinct.length == 3)
  }

  test("n equals 0") {
    assert(P24.lotto(0, 10).distinct.isEmpty)
  }

}
