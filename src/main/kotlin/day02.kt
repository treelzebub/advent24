fun day02(input: String) {
  val columns = input.columns()
  val occurrences = occurrences(columns[0], columns[1])
  val similarityScore = columns[0].mapIndexed { i, it -> it * occurrences[i] }.sum()
  println(similarityScore)
}

private fun occurrences(first: List<Int>, second: List<Int>): List<Int> {
  if (first.size != second.size) throw IllegalArgumentException("Lists are not the same size.")
  return first.map { firstItem ->
    second.count { secondItem -> secondItem == firstItem }
  }
}
