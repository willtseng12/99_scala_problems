package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P23Spec extends FunSuite {
  test("selecting from empty list") {
    assert(Nil == P23.randomSelect(0, List()))
    assert(Nil == P23.randomSelect(2, List()))
  }

  test("selecting singleton list") {
    assert(Nil == P23.randomSelect(0, List(1)))
    assert(List(1) == P23.randomSelect(2, List(1)))
  }

  test("selecting from generic list") {
    val list = List(1, 2, 3, 4, 5)
    val selected = P23.randomSelect(3, list)
    assert(selected.length == 3)
    assert(selected forall list.contains)
  }
}
