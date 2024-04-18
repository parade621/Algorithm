package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val list = readln().toCharArray()

    if (list.toSet().size == 1) {
        println("0")
        return
    }
    var cnt = 0
    var length = 0
    var cursor = 0
    for (i in 1 until list.size) {
        if (list[cursor] != list[i]) {
            length++
        } else {
            if (length != 0) {
                cnt++
                length = 0
            }
            cursor = i
        }
    }

    if (length != 0) {
        cnt++
    }

    println(cnt)
}