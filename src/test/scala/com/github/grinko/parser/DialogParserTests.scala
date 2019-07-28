package com.github.grinko.parser

import org.scalatest._

class DialogParserTests  extends FlatSpec {

  "Parser method" should "get only dialog lines" in {
    val testStrings = Array("first line.", "— second line", "— third line.", "fourth — line")
    val resultStrings = Array("— second line", "— third line")
    val parser = new DialogParser
    assert(parser.parse(testStrings) === resultStrings)
  }
}
