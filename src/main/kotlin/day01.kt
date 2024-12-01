import kotlin.math.abs

fun day01(input: String) {
  val sorted = input.columns().map { it.sorted() }.rows()
  val deltas = sorted.map { abs(it[0] - it[1]) }
  println(deltas.sum())
}
