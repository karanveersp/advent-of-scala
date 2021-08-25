package day1

import advent.day1.ReportRepair
import org.junit.Test
import org.junit.Assert._

class TestReportRepair {
  @Test def partOne(): Unit = {
    assertEquals(703131, ReportRepair.computePartOne(2020))
  }

  @Test def partTwo(): Unit = {
    assertEquals(272423970, ReportRepair.computePartTwo(2020))
  }
}
