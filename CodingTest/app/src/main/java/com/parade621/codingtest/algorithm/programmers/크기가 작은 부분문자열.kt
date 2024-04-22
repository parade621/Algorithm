package com.parade621.codingtest.algorithm.programmers

fun main() {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var num = ""
        for (i in t.indices) {
            num += t[i]
            if (num.length == p.length) {
                if (p.toLong() >= num.toLong()) answer++
                num = num.drop(1) // 드랍한거 다시 할당해 줘야함
            }
        }
        return answer
    }

    println(solution("3141592", "271"))
    println(solution("500220839878", "7"))
    println(solution("10203", "15"))
}