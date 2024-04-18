package com.parade621.codingtest.algorithm.beakjoon


fun main() {
    val n = readln().toInt()
    val list = arrayListOf<Int>()
    repeat(n) {
        list.add(readln().toInt())
    }
    list.sortDescending()
    var max = 0
    repeat(n){
        max = maxOf(max, (it + 1) * list[it])
    }
    println(max)
}