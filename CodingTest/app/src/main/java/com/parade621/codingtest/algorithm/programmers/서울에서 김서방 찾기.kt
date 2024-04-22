package com.parade621.codingtest.algorithm.programmers

fun main() {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var index = seoul.indexOf("Kim")
        answer = "김서방은 ${index}에 있다"
        return answer
    }

    println(solution(arrayOf("Jane", "Kim")))
}