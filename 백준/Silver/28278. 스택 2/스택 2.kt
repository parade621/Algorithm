import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val pw = PrintWriter(System.out)
    val num = br.readLine().toInt()
    val stack = ArrayDeque<Int>()

    repeat(num) {
        val input = br.readLine().split(" ").map { it.toInt() }
        when (input[0]) {
            1 -> stack.addLast(input[1])
            2 -> pw.println(if (stack.isEmpty()) -1 else stack.removeLast())
            3 -> pw.println(stack.size)
            4 -> pw.println(if (stack.isEmpty()) 1 else 0)
            5 -> pw.println(if (stack.isEmpty()) -1 else stack.last())
        }
    }
    pw.flush()
}
