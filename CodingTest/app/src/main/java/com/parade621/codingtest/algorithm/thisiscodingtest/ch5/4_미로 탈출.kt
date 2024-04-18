package com.parade621.codingtest.algorithm.thisiscodingtest.ch5

/**
 * 최단 경로 문제 --> BFS!
 */

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = MutableList(n) { MutableList(m) { 0 } }
    repeat(n) {
        graph[it] = readln().map { it.digitToInt() }.toMutableList()
    }
    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)
    fun bfs(sx: Int, sy: Int): Int {
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        queue.addLast(sx to sy)
        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()
            repeat(4) {
                val nx = x + dx[it]
                val ny = y + dy[it]
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) return@repeat
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1
                    queue.addLast(nx to ny)
                }
            }
        }
        return graph[n - 1][m - 1]
    }
    println(bfs(0, 0))
}

/**
 * 5 6
 * 101010
 * 111111
 * 000001
 * 111111
 * 111111
 *
 * 10
 */