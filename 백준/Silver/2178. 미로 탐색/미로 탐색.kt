fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    var arr = arrayListOf<List<Int>>()

    repeat(n) {
        val line = readln().map { it.toString().toInt() }
        arr.add(line)
    }

    val queue = ArrayDeque<Pair<Int, Int>>()
    val cntArr = MutableList(n) { MutableList(m) { 0 } }
    queue.addLast(Pair(0, 0))
    cntArr[0][0] = 1
    while (queue.isNotEmpty()) {
        val (x, y) = queue.removeFirst()
        val cnt = cntArr[x][y]

        if (x > 0 && arr[x - 1][y] == 1 && cntArr[x - 1][y] == 0) {
            queue.addLast(Pair(x - 1, y))
            cntArr[x - 1][y] = cnt + 1
        }
        if (x < n - 1 && arr[x + 1][y] == 1 && cntArr[x + 1][y] == 0) {
            queue.addLast(Pair(x + 1, y))
            cntArr[x + 1][y] = cnt + 1
        }
        if (y > 0 && arr[x][y - 1] == 1 && cntArr[x][y - 1] == 0) {
            queue.addLast(Pair(x, y - 1))
            cntArr[x][y - 1] = cnt + 1
        }
        if (y < m - 1 && arr[x][y + 1] == 1 && cntArr[x][y + 1] == 0) {
            queue.addLast(Pair(x, y + 1))
            cntArr[x][y + 1] = cnt + 1
        }
    }

    println(cntArr[n - 1][m - 1])
}