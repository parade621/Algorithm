package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val (n, m) = readln().split(" ").map { it.toLong() }
    var queue = ArrayDeque<Pair<Long, Int>>()
    queue.add(Pair(n, 1))

    while (queue.isNotEmpty()) {
        val (cur, cnt) = queue.removeFirst()

        if (cur == m) {
            println(cnt)
            return
        }
        val mx = 2 * cur
        val my = cur * 10 + 1
        if (mx <= m) queue.add(Pair(mx, cnt + 1))
        if (my <= m) queue.add(Pair(my, cnt + 1))
    }
    println(-1)
}