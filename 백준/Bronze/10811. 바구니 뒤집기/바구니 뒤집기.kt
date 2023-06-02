fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val n = input[0] // 배열 크기
    val m = input[1] // 뒤집을 구간 개수

    val array = IntArray(n) { it + 1 } // 1부터 n까지의 배열 생성

    repeat(m) {
        val input2 = readLine()!!.split(" ").map { it.toInt() }
        val start = input2[0] - 1
        val end = input2[1] - 1

        // 배열의 start부터 end까지의 구간을 뒤집음
        for (i in 0 until (end - start + 1) / 2) {
            val tmp = array[start + i]
            array[start + i] = array[end - i]
            array[end - i] = tmp
        }
    }

    println(array.joinToString(" "))
}
