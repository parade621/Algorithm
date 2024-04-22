package com.parade621.codingtest.algorithm.programmers

// 코테 뇌살리기 프로젝트
fun main() {
    fun solution(n: Int): Int {
        var answer = 0
        var arr = arrayListOf<Int>()
        for (i in 1..n / 2) {
            if (n % i == 0) {
                arr.add(i)
            }
        }
        answer = arr.sum() + n

        return answer
    }

    println(solution(12))
    println(solution(5))
}