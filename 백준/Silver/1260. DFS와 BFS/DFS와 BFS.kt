fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val arr: ArrayList<ArrayList<Int>> = ArrayList(n)
    for (i in 0 until n) {
        val row = ArrayList<Int>(n)
        for (j in 0 until n) row.add(0)
        arr.add(row)
    }
    val visited = MutableList(n) { false }

    repeat(m) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        arr[x - 1][y - 1] = 1
        arr[y - 1][x - 1] = 1
    }
    dfs(arr, v - 1, visited)
    println()
    bfs(arr, v - 1, n)
}

fun dfs(graph: ArrayList<ArrayList<Int>>, index: Int, visited: MutableList<Boolean>) {
    visited[index] = true
    print("${index + 1} ")
    for (i in 0 until graph[index].size) {
        if (graph[index][i] == 1 && !visited[i]) {
            dfs(graph, i, visited)
        }
    }
}

fun bfs(graph: ArrayList<ArrayList<Int>>, index: Int, size: Int) {
    val queue = ArrayDeque<Int>()
    val visited = MutableList(size) { false }
    queue.addLast(index)
    visited[index] = true
    while (queue.isNotEmpty()) {
        val next = queue.removeFirst()
        print("${next + 1} ")
        for (i in 0 until graph[next].size) {
            if (graph[next][i] == 1 && !visited[i]) {
                queue.addLast(i)
                visited[i] = true
            }
        }
    }
}