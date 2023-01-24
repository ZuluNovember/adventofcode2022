package AOC

object Day1 {
  def part1(input: Array[Array[String]]): Int = input
    .map(_.map(_.toInt).sum)
    .max

  def part2(input: Array[Array[String]]): Int = input
    .map(_.map(_.toInt).sum)
    .sortWith(_ > _)
    .take(3)
    .sum

  lazy val input: Array[Array[String]] = io.Source
    .fromResource("day1.txt")
    .mkString
    .split("\n\n")
    .map(_.split("\n"))

  def main(args: Array[String]): Unit = {
    println(part1(input))
    print(part2(input))
  }
}

