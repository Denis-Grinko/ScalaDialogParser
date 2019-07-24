package com.github.grinko.util

import java.io.PrintWriter

import scala.io.Source

object FileUtil {
  def readFile(fileName: String): String = {
    val line = Source.fromFile(fileName).mkString
    line
  }

  def writeFile(fileName: String, writeString: String): Unit = {
    new PrintWriter(fileName) {
      write(writeString)
      close
    }
  }
}
