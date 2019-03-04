package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P04Spec extends FunSuite {
  test("generic list") {
    assert(3 == P04.lengthRecursive(List(1, 2, 3)))
  }
}
