package com.parade621.codingtest.algorithm.programmers

fun main() {
    fun solution(s: String): String {
        var answer = ""
        val list = s.split(" ").map { it.toInt() }
        answer += list.minOrNull()?:0.toString()
        answer += " "
        answer += list.max().toString()
        return answer
    }

    println(solution("1 2 3 4"))
    println(solution("-1 -2 -3 -4"))
    println(solution("-1 -1"))
}