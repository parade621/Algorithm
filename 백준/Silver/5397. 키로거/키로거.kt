import java.util.*

fun main() {
    val n = readln().toInt()
    repeat(n) {
        val str = readln()
        val leftStack = Stack<Char>()
        val rightStack = Stack<Char>()

        str.forEach { char ->
            when (char) {
                '<' -> if (!leftStack.isEmpty()) rightStack.push(leftStack.pop())
                '>' -> if (!rightStack.isEmpty()) leftStack.push(rightStack.pop())
                '-' -> if (!leftStack.isEmpty()) leftStack.pop()
                else -> leftStack.push(char)
            }
        }

        val builder = StringBuilder()
        leftStack.forEach { builder.append(it) }
        rightStack.reversed().forEach { builder.append(it) }

        println(builder.toString())
    }
}
