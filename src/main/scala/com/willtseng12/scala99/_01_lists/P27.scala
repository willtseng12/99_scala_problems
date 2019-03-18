package com.willtseng12.scala99._01_lists

object P27 {
  def group3[A](list: List[A]): List[List[List[A]]] = {
    for {
      comb2 <- P26.combinations(2, list)
      listMinus2 = list diff comb2
      comb3 <- P26.combinations(3, listMinus2)
    } yield List(comb2, comb3, listMinus2 diff comb3)
  }

  def groupN[A](ns: List[Int], list: List[A]): List[List[List[A]]] = {
    ns match {
      case Nil => List(Nil)
      case n :: ns => P26.combinations(n, list) flatMap {
        x =>
          groupN(ns, list diff x) map {
            x :: _
          }
      }
    }
  }
}

