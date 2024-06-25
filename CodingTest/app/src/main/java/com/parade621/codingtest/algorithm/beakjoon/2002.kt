package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val n = readln().toInt()
    val enter = mutableMapOf<String, Int>()
    val outer = mutableMapOf<String, Int>()
    var result = 0
    repeat(n) {
        val car = readln()
        enter[car] = it
    }

    repeat(n) {
        val car = readln()
        outer[car] = it
    }

    outer.forEach {
        val order = enter[it.key]!! - it.value
        if (order > 0) {
            result++
        } else {
            if (order + result != 0) {
                println(it.key + " " + enter[it.key] + " " + it.value + " " + order + " " + result)
                result++
            }
        }
    }
    println(result)
}