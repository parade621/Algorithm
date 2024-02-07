fun main() {
    val (x, y) = readln().split(" ").map { it.toInt() }
    val wall = readln().split(" ").map { it.toInt() }
    var result = 0

    for (i in 0 until y) {
        val leftMax = wall.subList(0, i).maxOrNull() ?: 0
        val rightMax = wall.subList(i + 1, y).maxOrNull() ?: 0

        val min = leftMax.coerceAtMost(rightMax)

        if (min > wall[i]) {
            result += min - wall[i]
        }
    }

    println(result)
}