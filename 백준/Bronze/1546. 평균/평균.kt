fun main() {
    val num: Int = readln().toInt()
    val subjects = readln().split(" ").map { it.toDouble() }
    val max = subjects.max()
    var sum = 0.0
    subjects.forEach {
        sum += ((it / max) * 100)
    }
    println(sum / num)
}