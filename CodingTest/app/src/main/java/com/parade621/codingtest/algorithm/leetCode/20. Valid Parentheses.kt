package com.parade621.codingtest.algorithm.leetCode

import java.util.Stack

fun main() {
    println(isValid("()"))
    println(isValid("()[]{}"))
    println(isValid("(]"))
    println(isValid("){"))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    if (s.length <= 1) {
        return false
    }

    for (i in s) {
        when (i) {
            '(', '[', '{' -> stack.push(i)
            ')' -> if (stack.isEmpty() || stack.peek() != '(') return false else stack.pop()
            ']' -> if (stack.isEmpty() || stack.peek() != '[') return false else stack.pop()
            '}' -> if (stack.isEmpty() || stack.peek() != '{') return false else stack.pop()
        }
    }
    return stack.isEmpty()
}