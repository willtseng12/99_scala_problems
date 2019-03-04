package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P07Spec extends FunSuite {
  test("empty list") {
    assert(List() == P07.flatten(List()))
  }

  test("list with only non-nested object") {
    assert(List(1) == P07.flatten(List(1)))
  }

  test("list with only nested object") {
    assert(List(1) == P07.flatten(List(List(1))))
  }

  test("generic list with mixed object") {
    assert(List(1, 1, 2, 3, 5, 8) == P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
