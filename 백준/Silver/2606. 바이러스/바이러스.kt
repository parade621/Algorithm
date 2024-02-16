fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val arr = Array(n + 1) { IntArray(n + 1) }
    val visited = BooleanArray(n + 1)
    var cnt = 0
    repeat(m) {
        var (a, b) = readln().split(" ").map { it.toInt() }
        arr[a][b] = 1
        arr[b][a] = 1
    }
    fun dfs(graph: Array<IntArray>, index: Int) {
        visited[index] = true
        for (i in 0 .. n) {
            if (!visited[i]) {
                if (graph[index][i] == 1) {
                    dfs(graph, i)
                    cnt++
                }
            }
        }
    }
    dfs(arr,1)
    println(cnt)
}