fun main() {
    val n = readln().toInt()
    val (x, y) = readln().split(" ").map { it.toInt() }
    val m = readln().toInt()

    // 2차원 ArrayList를 초기화하는 더 간단한 방법
    val arr = List(n) { MutableList(n) { 0 } }

    val visited = MutableList(n) { false }
    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() - 1 }
        arr[a][b] = 1
        arr[b][a] = 1
    }

    var result = -1

    fun dfs(index: Int, cnt: Int) {
        if (visited[index]) return
        visited[index] = true
        if (index == y - 1) {
            result = cnt
            return
        }
        for (i in 0 until n) {
            if (arr[index][i] == 1 && !visited[i]) {
                dfs(i, cnt + 1)
            }
        }
    }
    
    dfs(x - 1, 0)
    println(result)
}