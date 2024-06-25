package com.parade621.codingtest.algorithm.beakjoon

fun main(){
    val (n, m) = readln().split(" ").map{ it.toInt() }
    val siteMap = mutableMapOf<String, String>()
    repeat(n){
        val (s, p) = readln().split(" ")
        siteMap.put(s, p)
    }
    repeat(m){
        println(siteMap[readln()])
    }
}