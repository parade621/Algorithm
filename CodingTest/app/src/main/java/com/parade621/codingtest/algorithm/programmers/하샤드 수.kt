package com.parade621.codingtest.algorithm.programmers

// 코테 뇌 살리기 프로젝트2
fun main() {
    println(하샤드수(10))
    println(하샤드수(12))
    println(하샤드수(11))
    println(하샤드수(13))
}

fun 하샤드수(x: Int): Boolean {
    var num = x
    var sum = 0
    while (num > 10) {
        sum += num % 10
        num /= 10
    }
    sum += num
    return x % sum == 0
}