package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P05Spec extends FunSuite {

  test("empty list") {
    assert(List() == P05.reverseRecursive(List()))
  }
  test("generic list") {
    assert(List(3, 2, 1) == P05.reverseRecursive(List(1, 2, 3)))
  }
}
