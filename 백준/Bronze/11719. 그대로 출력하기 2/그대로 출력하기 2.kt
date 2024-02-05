import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true){
        val line = br.readLine()
        if (line == null) break
        bw.write(line)
        bw.newLine()
    }
    bw.flush()
    bw.close()
}