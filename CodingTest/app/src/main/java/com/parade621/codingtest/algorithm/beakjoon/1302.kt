package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val bookMap = mutableMapOf<String, Int>()
    repeat(readln().toInt()) {
        val book = readln()
        bookMap[book] = (bookMap[book] ?: 0) + 1
    }
    val max = bookMap.values.max()
    var result = ""
    bookMap.forEach {
        if (it.value == max) {
            if (result.isEmpty()) {
                result = it.key
            } else {
                result = minOf(result, it.key)
            }
        }
    }
    println(result)
}