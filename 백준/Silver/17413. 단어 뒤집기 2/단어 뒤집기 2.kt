fun main() {
    val str = readln()
    var result = StringBuilder()
    var isTag = false
    val stack = ArrayDeque<Char>()

    str.forEach { char ->
        when {
            char == '<' -> {
                while (stack.isNotEmpty()) {
                    result.append(stack.removeFirst())
                }
                isTag = true
                result.append(char)
            }
            char == '>' -> {
                isTag = false
                result.append(char)
            }
            isTag -> {
                result.append(char)
            }
            char.isWhitespace() -> {
                while (stack.isNotEmpty()) {
                    result.append(stack.removeFirst())
                }
                result.append(char)
            }
            else -> {
                stack.addFirst(char)
            }
        }
    }

    while (stack.isNotEmpty()) {
        result.append(stack.removeFirst())
    }

    println(result.toString())
}