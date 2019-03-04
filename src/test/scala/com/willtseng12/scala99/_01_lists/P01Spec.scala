package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P01Spec extends FunSuite {

  test("P01 - Last element of an empty list") {
    intercept[NoSuchElementException] {
      P01.lastRecursive(Nil)
      P01.lastBuiltIn(Nil)
    }
  }

  test("P01 - Last element of a singleton list") {
    assert("foo" == P01.lastRecursive(List("foo")))
    assert("foo" == P01.lastBuiltIn(List("foo")))
  }

  test("P01 - Last element of a generic list") {
    assert("baz" == P01.lastRecursive(List("foo", "bar", "baz")))
    assert("baz" == P01.lastBuiltIn(List("foo", "bar", "baz")))

  }

}
