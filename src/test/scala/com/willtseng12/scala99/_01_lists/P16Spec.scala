package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P16Spec extends FunSuite {
  test("empty list") {
    assert(List() == P16.dropRecursive(3, List()))
    assert(List() == P16.drop(3, List()))
  }

  test("index factor 0") {
    intercept[ArithmeticException] {
      P16.dropRecursive(0, List('a, 'b))
      P16.drop(0, List('a, 'b))
    }
  }

  test("index factor 1") {
    assert(List() == P16.dropRecursive(1, List('a, 'b)))
    assert(List() == P16.drop(1, List('a, 'b)))
  }

  test("generic list of length not a multiple of index factor") {
    assert(List('a, 'b, 'd, 'e) == P16.dropRecursive(3, List('a, 'b, 'c, 'd, 'e)))
    assert(List('a, 'b, 'd, 'e) == P16.drop(3, List('a, 'b, 'c, 'd, 'e)))
  }

  test("generic list of length a multiple of index factor") {
    assert(List('a, 'c) == P16.dropRecursive(2, List('a, 'b, 'c, 'd)))
    assert(List('a, 'c) == P16.drop(2, List('a, 'b, 'c, 'd)))
  }
}
