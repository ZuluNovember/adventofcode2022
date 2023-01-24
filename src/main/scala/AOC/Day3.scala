package AOC

object Day3 {
  val input: Array[String] = io.Source.fromResource("day3.txt").mkString("").split("\n")

  private def findCommon(tup: (String, String)) = tup._1.intersect(tup._2).charAt(0)

  private def findBadge(arr: Array[String]) = arr.reduce((x, y) => x.intersect(y)).charAt(0)

  private def findPriority(c: Char) = {
    val charCode = c.toInt

    if (charCode > 'Z'.toInt) {
      charCode - 96
    } else {
      charCode - 38
    }
  }

  def part1(input: Array[String]): Int = input
    .map(s => s.splitAt(s.length / 2))
    .map(findCommon)
    .map(findPriority)
    .sum

  def part2(input: Array[String]): Int = input
    .grouped(3)
    .toArray
    .map(findBadge)
    .map(findPriority)
    .sum

  def main(args: Array[String]): Unit = {
    println(part1(input))
    println(part2(input))

  }
}
