package com.parade621.codingtest.algorithm.thisiscodingtest.ch5

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = MutableList(n) { MutableList(m) { 0 } }
    repeat(n) {
        arr[it] = readln().map { it.digitToInt() }.toMutableList()
    }
    fun dfs(x: Int, y: Int): Boolean {
        if (x >= n || x < 0 || y >= m || y < 0) return false
        if (arr[x][y] == 0) {
            arr[x][y] = 1
            dfs(x - 1, y)
            dfs(x + 1, y)
            dfs(x, y - 1)
            dfs(x, y + 1)
            return true
        }
        return false
    }

    var result = 0
    repeat(n) { i ->
        repeat(m) { j ->
            if (dfs(i, j)) result++
        }
    }

    println(result)
}
/**
 * input1
 * 4 5
 * 00110
 * 00011
 * 11111
 * 00000
 *
 * output2
 * 3
 */

/**
 * input2
 * 15 14
 * 00000111100000
 * 11111101111110
 * 11011101101110
 * 11011101100000
 * 11011111111111
 * 11011111111100
 * 11000000011111
 * 01111111111111
 * 00000000011111
 * 01111111111000
 * 00011111111000
 * 00000001111000
 * 11111111110011
 * 11100011111111
 * 11100011111111
 *
 * output1
 * 8
 */