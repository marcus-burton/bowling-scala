Feature: Ten Pin Bowling

  Scenario Outline: Basic Frame Score - Not Strike or Spare
    When <First bowl> pins and <Second bowl> pins are knocked down in a Frame
    Then the score for the Frame is <Frame score>
  Examples:
    | First bowl | Second bowl | Frame score |
    | 0          | 0           | 0           |
    | 1          | 0           | 1           |
    | 0          | 2           | 2           |
    | 3          | 4           | 7           |
    | 9          | 0           | 9           |
    | 5          | 4           | 9           |
