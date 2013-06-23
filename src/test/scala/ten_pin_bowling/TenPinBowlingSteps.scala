package ten_pin_bowling

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.matchers.ShouldMatchers
import ten_pin_bowling.TenPinBowling.frameScore

class TenPinBowlingSteps extends ScalaDsl with EN with ShouldMatchers {

  var actualFrameScore: Int = 0

  When( """^(\d+) pins and (\d+) pins are knocked down in a Frame$""") {
    (firstBowl: Int, secondBowl: Int) =>
      actualFrameScore = frameScore(firstBowl, secondBowl)
  }

  Then( """^the score for the Frame is (\d+)$""") {
    (expectedFrameScore: Int) =>
      actualFrameScore should be(expectedFrameScore)
  }
}
