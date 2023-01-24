package AOC

object Day2 {
  private def getMatchupScore(matchup: Array[String]): Int =
    (matchup(0), matchup(1)) match {
      case ("A", "X") => 4
      case ("A", "Y") => 8
      case ("A", "Z") => 3
      case ("B", "X") => 1
      case ("B", "Y") => 5
      case ("B", "Z") => 9
      case ("C", "X") => 7
      case ("C", "Y") => 2
      case ("C", "Z") => 6
    }

  private def getMatchupScoreP2(matchup: Array[String]): Int =
    (matchup(0), matchup(1)) match {
      case ("A", "X") => 3
      case ("A", "Y") => 4
      case ("A", "Z") => 8
      case ("B", "X") => 1
      case ("B", "Y") => 5
      case ("B", "Z") => 9
      case ("C", "X") => 2
      case ("C", "Y") => 6
      case ("C", "Z") => 7
    }
  def part1(input: Array[Array[String]]): Int = input.map(getMatchupScore).sum

  def part2(input: Array[Array[String]]): Int = input.map(getMatchupScoreP2).sum

  val input: Array[Array[String]] = io.Source.fromResource("day2.txt").mkString("").split("\n").map(_.split(" "))

  def main(args: Array[String]): Unit = {
    println(part1(input))
    println(part2(input))
  }
}
