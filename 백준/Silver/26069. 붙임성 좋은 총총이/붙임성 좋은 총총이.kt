fun main() {
    val n = readln().toInt()
    val dance = mutableSetOf<String>("ChongChong")
    var result = 1
    repeat(n) {
        val (a, b) = readln().split(" ")
        if (dance.contains(a)) {
            if (!dance.contains(b)) {
                dance.add(b)
                result += 1
            }
        } else if (dance.contains(b)) {
            if (!dance.contains(a)) {
                dance.add(a)
                result += 1
            }
        }
    }
    println(result)
}