package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P02Spec extends FunSuite {
  test("generic list") {
    assert(2 == P02.lastButOneRecursive(List(1, 2, 3)))
  }
}
