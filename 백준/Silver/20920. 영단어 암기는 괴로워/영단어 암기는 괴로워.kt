import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (N, M) = readln().split(" ").map { it.toInt() }
    val word = hashMapOf<String, Int>()
    var max = 1
    repeat(N) {
        val str = readln()
        if (str.length < M) {
            return@repeat
        }
        if (word.containsKey(str)) {
            word[str] = word[str]!! + 1
            if (word[str]!! > max) {
                max = word[str]!!
            }
        } else {
            word[str] = 1
        }
    }

    val sortList = MutableList(max) { ArrayList<String>() }

    word.toSortedMap().toList().sortedByDescending { it.second }.forEach {
        sortList[it.second - 1].add(it.first)
    }

    for (i in sortList.indices.reversed()) {
        if (sortList[i].isEmpty()) {
            continue
        }
        sortList[i].sortedByDescending { it.length }.forEach {
            bw.write("$it\n")
        }
    }

    bw.flush()
    bw.close()
}