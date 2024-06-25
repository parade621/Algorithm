package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val n = readln().toInt()
    val cardMap = mutableMapOf<Long, Int>()
    var max = 0L

    repeat(n) {
        val num = readln().toLong()
        cardMap[num] = (cardMap[num] ?: 0) + 1

        if (max == 0L) {
            max = num
        } else {
            if (cardMap[max]!! < cardMap[num]!!) {
                max = num
            } else if (cardMap[max]!! == cardMap[num]!!) {
                max = minOf(max, num)
            }
        }
    }

    println(max)
}