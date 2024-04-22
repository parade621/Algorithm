package com.parade621.codingtest.algorithm.programmers

fun main() {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        var answer: Int = 0
        val index = friends.mapIndexed { idx, name -> name to idx }.toMap()
        val giftIndices = IntArray(friends.size) { 0 }
        val result = IntArray(friends.size) { 0 }

        val grid = Array(friends.size) { IntArray(friends.size) { 0 } }

        gifts.forEach {
            val (x, y) = it.split(" ")
            grid[index[x]!!][index[y]!!]++
            giftIndices[index[x]!!] += 1
            giftIndices[index[y]!!] -= 1
        }

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                val x = grid[i][j]
                val y = grid[j][i]
                if (x == -1 || y == -1) continue
                when {
                    (x > y) -> {
                        result[i] += 1
                    }

                    (x < y) -> {
                        result[j] += 1
                    }

                    (x == y) -> {
                        if (giftIndices[i] > giftIndices[j]) result[i]++
                        else if (giftIndices[j] > giftIndices[i]) result[j]++
                        else continue
                    }
                }
                grid[i][j] = -1
                grid[j][i] = -1
            }
        }

        answer = result.maxOrNull() ?: 0

        return answer
    }

    println(
        solution(
            arrayOf("joy", "brad", "alessandro", "conan", "david"),
            arrayOf(
                "alessandro brad",
                "alessandro joy",
                "alessandro conan",
                "david alessandro",
                "alessandro david"
            )
        )
    )
}