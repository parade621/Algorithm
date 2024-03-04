fun main() {
    val n = readln().toInt()
    val s = mutableListOf<Int>()
    repeat(n) {
        s.add(readln().toInt())
    }
    var max = s.last()
    var result = 1
    s.reversed().forEach {
        if (it > max) {
            result++
            max = it
        }
    }

    println(result)
}