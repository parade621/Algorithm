package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val n = readln().toMutableList()
    if (!n.contains('0')) {
        println(-1)
        return
    }
    n.sortDescending()
    val sum = n.sumOf { it - '0' }
    if (sum % 3 != 0) {
        println(-1)
        return
    }
    n.sortDescending()
    println(n.joinToString(""))
}