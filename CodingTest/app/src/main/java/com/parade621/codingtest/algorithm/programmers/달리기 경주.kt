package com.parade621.codingtest.algorithm.programmers

fun main() {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val hash = mutableMapOf<String, Int>()
        players.forEachIndexed { index, player ->
            hash[player] = index
        }

        for (i in callings) {
            val acc = hash[i] ?: continue
            val temp = players[acc - 1]
            players[acc - 1] = players[acc]
            players[acc] = temp
            hash[players[acc]] = acc
            hash[players[acc - 1]] = acc - 1
        }

        return players
    }

    println(
        solution(
            arrayOf("mumu", "soe", "poe", "kai", "mine"),
            arrayOf("kai", "kai", "mine", "mine")
        )
    )
}
