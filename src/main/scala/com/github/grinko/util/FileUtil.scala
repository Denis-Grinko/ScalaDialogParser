package com.github.grinko.util

import java.io.PrintWriter

import scala.io.Source

object FileUtil {
  def readFile(fileName: String): Array[String] = {
    Source.fromFile(fileName).getLines.toArray
  }

  def writeFile(fileName: String, writeString: String): Unit = {
    new PrintWriter(fileName) {
      write(writeString)
      close
    }
  }
}
