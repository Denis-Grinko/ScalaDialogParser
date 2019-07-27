package com.github.grinko.parser

import scala.util.matching.Regex.Match

class DialogParser {
  def parse(string: Array[String]): Array[String] = {
    string
      .filter(_.startsWith("— "))
      .map(array => array.split("[?.!]"))
      .map(_.head)
  }
}

