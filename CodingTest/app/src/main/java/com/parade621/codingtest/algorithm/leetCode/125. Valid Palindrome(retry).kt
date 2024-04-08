package com.parade621.codingtest.algorithm.leetCode

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
    println(isPalindrome("aba"))
}

fun isPalindrome(s: String): Boolean {
    val cleaned = s.filter { it.isLetterOrDigit() }.toLowerCase()

    val half = cleaned.length / 2
    for (i in 0 until half) {
        if (cleaned[i] != cleaned[cleaned.length - i - 1]) {
            return false
        }
    }
    return true
}