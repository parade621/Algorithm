fun main() {
    val n = readln().toInt()
    val (x, y) = readln().split(" ").map { it.toInt() }
    val m = readln().toInt()
    val arr: ArrayList<ArrayList<Int>> = ArrayList(n)
    for (i in 0 until n) {
        val row = ArrayList<Int>(n)
        for (j in 0 until n) row.add(0)
        arr.add(row)
    }
    val visited = MutableList(n) { false }
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() - 1 }
        arr[a][b] = 1
        arr[b][a] = 1
    }

    var result = -1

    fun dfs(graph: ArrayList<ArrayList<Int>>, index: Int, visited: MutableList<Boolean>, cnt: Int) {
        visited[index] = true
        if (index + 1 == y) {
            result = cnt
            return
        }
        for (i in 0 until graph[index].size) {
            if (graph[index][i] == 1 && !visited[i]) {
                dfs(graph, i, visited, cnt + 1)
            }
        }
    }
    dfs(arr, x - 1, visited, 0)
    println(result)
}