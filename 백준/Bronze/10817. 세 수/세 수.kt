import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val intList = br.readLine().split(" ").map { it.toInt() }
    val result = intList.sorted()
    bw.write(result[result.size - 2].toString())
    bw.flush()
    bw.close()
}