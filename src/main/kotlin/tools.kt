fun String.columns(): List<List<Int>> {
  val columns = lines().map {
    it.trim()
      .split(Regex("\\s+"))
      .map(String::toInt)
  }
  return columns[0].indices.map { colIndex ->
    columns.map { it[colIndex] }
  }
}

fun List<List<Int>>.rows(): List<List<Int>> {
  return this[0].indices.map { rowIndex -> map { it[rowIndex] } }
}

fun occurrences(first: List<Int>, second: List<Int>) = first.map { firstItem ->
  second.count { secondItem -> secondItem == firstItem }
}
















