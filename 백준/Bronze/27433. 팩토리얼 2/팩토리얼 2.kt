fun factorial(num: Long): Long {
    if (num <= 1) {
        return 1
    }
    return num * factorial(num - 1)
}

fun main() {
    println(factorial(readln().toLong()))
}