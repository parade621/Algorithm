fun solution(str: String): List<Int> {
    val list = MutableList(26) { 0 }
    str.forEach { chr ->
        val index = chr.toInt() - 97
        list[index] += 1
    }
    return list
}

fun main() {
    val input = readln()
    val result = solution(input)
    result.forEach{
        print("$it ")
    }
}