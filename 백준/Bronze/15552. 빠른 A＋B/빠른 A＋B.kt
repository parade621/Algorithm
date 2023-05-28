import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val size = reader.readLine()!!.toInt()
    repeat(size) {
        val sum = reader.readLine()!!.split(" ").map { it.toLong() }
        writer.write("${sum.sum()}")
        writer.newLine()
    }

    writer.flush()
    writer.close()
    reader.close()
}

