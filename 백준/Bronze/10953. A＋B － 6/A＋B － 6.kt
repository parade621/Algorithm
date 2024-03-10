fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (a, b) = readln().split(",").map { it.toInt() }
        println(a + b)
    }
}