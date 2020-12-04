package advent.day1

import scala.io.Source

object ReportRepair {
  
  private def getIntegersFromFile(): List[Int] =
    Source.fromResource("day1-input.txt")
      .getLines()
      .map(_.toInt) 
      .toList
  
  def computePartOne(target: Int): Int = {
    val numbers = getIntegersFromFile()
    for (i <- 0 until (numbers.length-1)) {
      for (j <- i + 1 until numbers.length) {
        if (numbers(i) + numbers(j) == target) {
          return numbers(i) * numbers(j)
        }
      }
    }
    return 0
  }
  
  def computePartTwo(target: Int): Int = {
    val numbers = getIntegersFromFile()
    (0 until (numbers.length-2)).foreach(i => {
      (i + 1 until (numbers.length-1)).foreach(j => {
        (j + 1 until (numbers.length)).foreach(k => {
          if (numbers(i) + numbers(j) + numbers(k) == target) {
            return numbers(i) * numbers(j) * numbers(k)
          }
        })
      })
    })
    return 0
  }
}
