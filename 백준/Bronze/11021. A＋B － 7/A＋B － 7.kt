import java.io.*

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val case = reader.readLine()!!.toInt()

    for (i in 0 until case){
        val sum = reader.readLine().split(" ").map{it.toLong()}
        writer.write("Case #${i+1}: ${sum.sum()}")
        writer.newLine()
    }
    writer.flush()
    writer.close()
    reader.close()
}