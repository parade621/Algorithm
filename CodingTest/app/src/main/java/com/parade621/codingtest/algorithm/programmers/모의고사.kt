package com.parade621.codingtest.algorithm.programmers

// 완전탐색 뇌 말랑이 연습
fun main() {
    fun solution(answers: IntArray): IntArray {
        var answer = arrayListOf<Int>()
        val cnt = intArrayOf(0, 0, 0)
        val student = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )

        for (i in answers.indices) {
            if (answers[i] == student[0][i % 5]) cnt[0]++
            if (answers[i] == student[1][i % 8]) cnt[1]++
            if (answers[i] == student[2][i % 10]) cnt[2]++
        }

        val max = cnt.maxOrNull() ?: 0 // 최대 점수 계산
        for ((index, score) in cnt.withIndex()) {
            if (score == max) {
                answer.add(index + 1)
            }
        }

        return answer.toIntArray()
    }

    println(solution(intArrayOf(1, 2, 3, 4, 5)))
    println(solution(intArrayOf(1, 3, 2, 4, 2)))
}