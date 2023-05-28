import java.io.BufferedReader
import java.io.InputStreamReader

fun swap(array: Array<Int>, index1: Int, index2: Int) {
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val input = reader.readLine().split(" ").map { it.toInt() }
    val N = input[0]
    val M = input[1]

    val array = Array(N) { it + 1 }

    repeat(M) {
        val input = reader.readLine().split(" ").map { it.toInt() }
        val pointer1 = input[0] - 1
        val pointer2 = input[1] - 1
        swap(array, pointer1, pointer2)
    }

    println(array.joinToString(" "))
}
