package com.example

import org.scalacheck.*
import org.scalacheck.Prop.*

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.Checkers

class MainSpec extends AnyWordSpec with Matchers with Checkers {
  "excite" should {
    "shout everything" in {
      check { (s: String) =>
        "endsWith('!')" |: Main.excite(s).endsWith("!")
      }
    }
  }
}
