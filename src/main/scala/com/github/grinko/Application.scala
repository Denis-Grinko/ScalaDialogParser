package com.github.grinko

import com.github.grinko.util.FileUtil

object Application {
  def main(args: Array[String]): Unit = {
    FileUtil.writeFile("file", FileUtil.readFile("book.txt"))
  }

}
