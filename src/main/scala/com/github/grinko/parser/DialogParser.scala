package com.github.grinko.parser


class DialogParser {
  val STRING_PREFIX = "— "
  val STRING_DELIMITERS ="[?.!]"

  def parse(string: Array[String]): Array[String] = {
    string
      .filter(_.startsWith(STRING_PREFIX))
      .map(_.trim)
      .map(_.split(STRING_DELIMITERS))
      .map(_.head)
  }
}

