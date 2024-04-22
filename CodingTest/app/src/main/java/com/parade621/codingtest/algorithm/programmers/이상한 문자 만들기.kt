package com.parade621.codingtest.algorithm.programmers

// 두뇌 말랑 프로젝트
fun main() {
    fun solution(s: String): String {
        var answer = ""

        var str = s.split(" ")
        answer = str.map { word ->
            word.mapIndexed { index, c ->
                if (index % 2 == 0) c.uppercase() else c.lowercase()
            }.joinToString("")
        }.joinToString(" ")

        return answer
    }

    println(solution("try hello world"))

}