package com.willtseng12.scala99._01_lists

object P07 {
  def flatten(list: List[Any]): List[Any] = {
    list flatMap {
      case xs: List[_] => flatten(xs)
      case x => List(x)
    }
  }
}
