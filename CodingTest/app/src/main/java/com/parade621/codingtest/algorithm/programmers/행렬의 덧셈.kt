package com.parade621.codingtest.algorithm.programmers

fun main() {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = ArrayList<IntArray>()
        arr1.forEachIndexed { index, arr ->
            var result = arrayListOf<Int>()
            for (i in arr.indices) {
                result.add(arr[i] + arr2[index][i])
            }
            answer.add(result.toIntArray())
        }
        return answer.toTypedArray()
    }
    println(
        solution(
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
            arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
        )
    )

    println(
        solution(
            arrayOf(intArrayOf(1), intArrayOf(2)),
            arrayOf(intArrayOf(3), intArrayOf(4))
        )
    )
}