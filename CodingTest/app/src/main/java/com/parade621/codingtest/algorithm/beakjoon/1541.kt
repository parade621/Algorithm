package com.parade621.codingtest.algorithm.beakjoon

fun main() {
    val n = readln().split('-')
    val list = n.map { it.split('+').sumOf(String::toInt) }
    var sum = list.fold(list.first() * 2) { acc, next -> acc - next }
    println(sum)
}