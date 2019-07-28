package com.github.grinko

import com.github.grinko.parser.DialogParser
import com.github.grinko.util.FileUtil

object Application {
  def main(args: Array[String]): Unit = {
    new DialogParser{parse(FileUtil.readFile("book.txt")).map(println(_))}
  }
}
