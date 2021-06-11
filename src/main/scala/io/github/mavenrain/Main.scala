package io.github.mavenrain

import io.github.mavenrain.removeElem

@main
def run =
  println("Hello world!")
  println(("Hi", true, 2).removeElem[Int]._2)