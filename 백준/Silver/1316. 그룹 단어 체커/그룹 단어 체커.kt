fun checkWord(word: String): Boolean {
    val checkList = ArrayDeque<Char>()
    word.forEach {
        if (checkList.isEmpty()) {
            checkList.addLast(it)
        }else if (it == checkList.last()) {
            return@forEach
        } else if (it in checkList) {
            return false
        } else {
            checkList.addLast(it)
        }
    }
    return true
}

fun main() {
    val num = readln().toInt()
    var result = 0
    for (i in 0 until num) {
        val word = readln()
        if (checkWord(word)) {
            result += 1
        }
    }

    println(result)
}