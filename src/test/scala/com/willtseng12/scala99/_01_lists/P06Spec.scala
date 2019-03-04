package com.willtseng12.scala99._01_lists

import org.scalatest.FunSuite

class P06Spec extends FunSuite {
  test("empty list") {
    assert(P06.isPalindrome(List()))
  }

  test("singelton list") {
    assert(P06.isPalindrome(List(1)))
  }

  test("generic odd list palindrome") {
    assert(P06.isPalindrome(List(1, 2, 1)))
  }

  test("generic even list palindrome") {
    assert(P06.isPalindrome(List(1, 2, 2, 1)))
  }

  test("not a palindrome list") {
    assert(!P06.isPalindrome(List(1, 2, 3)))
  }
}
