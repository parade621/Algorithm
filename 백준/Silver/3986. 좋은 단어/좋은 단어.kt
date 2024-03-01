fun main() {
    val n = readln().toInt()
    var result = 0

    repeat(n) {
        var stack = ArrayDeque<Char>()
        val str = readln()
        str.forEach {
            if (stack.isEmpty()) {
                stack.addLast(it)
            } else if (stack.last() == it) {
                stack.removeLast()
            } else {
                stack.addLast(it)
            }
        }
        if (stack.isEmpty()) {
            result++
        }
    }

    println(result)
}