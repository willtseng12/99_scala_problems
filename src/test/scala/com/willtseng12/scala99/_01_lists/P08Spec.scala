package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P08Spec extends FunSuite {
  test("empty list") {
    assert(List() == P08.compressRecursive(List()))
  }

  test("singleton list") {
    assert(List(1) == P08.compressRecursive(List(1)))
  }

  test("generic list with consecutive repetition") {
    assert(List(1, 2, 1, 3) == P08.compressRecursive(List(1, 1, 2, 1, 1, 3, 3)))
    assert(List(1, 2, 1, 3) == P08.compress(List(1, 1, 2, 1, 1, 3, 3)))

  }
}
