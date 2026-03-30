package com.example

object Main {
  def excite(s: String): String = s"$s!"

  def main(args: Array[String]): Unit = {
    println(excite("Hello, world"))
  }
}
