package com.parade621.codingtest.algorithm.programmers

// 코테 뇌살리기 프로젝트
fun main() {
    fun solution(n: Int, m: Int): IntArray {
        var answer = arrayListOf<Int>()

        var nList = (n downTo 1).filter { n % it == 0 }.associateWith { it }
        var mList = (m downTo 1).filter { m % it == 0 }.associateWith { it }
        for (i in nList) {
            if (mList.containsKey(i.key)) {
                answer.add(i.key)
                break
            }
        }
        for (i in minOf(n, m)..n * m) {
            if (i % n == 0 && i % m == 0) {
                answer.add(i)
                break
            }
        }
        return answer.toIntArray()
    }

    println(solution(3, 12))
    println(solution(2, 5))
}