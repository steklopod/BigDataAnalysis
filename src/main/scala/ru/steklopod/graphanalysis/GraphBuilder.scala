package ru.steklopod.graphanalysis

import org.apache.spark.SparkContext
import org.apache.spark.graphx.{Graph, GraphLoader}

object GraphBuilder {

  def loadFromFile(sc: SparkContext, path: String): Graph[Int, Int] = {
    GraphLoader.edgeListFile(sc, path)
  }
}
