fun main() {
    while (true) {
        val n = readlnOrNull()?.toInt() ?: break
        println(recursive("-".repeat(pow(n))))
    }
}

fun recursive(str: String): String {
    if (str.length == 1) {
        return "-"
    }
    val s = str.length / 3
    val e = str.length / 3 * 2
    return recursive(str.substring(0, s)) + " ".repeat(e - s) + recursive(str.substring(e))
}

fun pow(n: Int): Int {
    var result = 3
    if (n == 0) return 1
    for (i in 1 until n) {
        result *= 3
    }
    return result
}