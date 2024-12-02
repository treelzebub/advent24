fun day02(input: String) {
  val columns = input.columns()
  val occurrences = occurrences(columns[0], columns[1])
  val similarityScore = columns[0].mapIndexed { i, it -> it * occurrences[i] }.sum()
  println(similarityScore)
}
