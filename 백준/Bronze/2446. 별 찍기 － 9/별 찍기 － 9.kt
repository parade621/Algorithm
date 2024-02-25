fun main() {
    val n = readln().toInt()

    val a = n - 1

    repeat(a) { index ->
        for (i in 0 until index) {
            print(" ")
        }
        for (j in a - index downTo 0) {
            print("*")
        }
        for (k in a - index downTo 1) {
            print("*")
        }
        println()
    }

    repeat(n) { index ->
        for (i in n - index downTo 2) {
            print(" ")
        }
        for (j in 0 until index) {
            print("*")
        }
        for (k in 0..index) {
            print("*")
        }
        println()
    }
}