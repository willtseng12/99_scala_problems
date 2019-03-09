package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P19Spec extends FunSuite {
  test("no rotation index") {
    assert(List(1, 2, 3) == P19.rotate(0, List(1, 2, 3)))
  }
  test("positive rotation index") {
    assert(List(2, 3, 1) == P19.rotate(1, List(1, 2, 3)))
  }
  test("negative rotation index") {
    assert(List(2, 3, 1) == P19.rotate(-2, List(1, 2, 3)))
  }
}
