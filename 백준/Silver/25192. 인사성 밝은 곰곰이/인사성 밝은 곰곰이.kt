fun main() {
    val n = readln().toInt()
    val members = mutableSetOf<String>()
    var result = 0
    repeat(n) {
        val str = readln()
        if (str == "ENTER") {
            members.clear()
        } else {
            if (!members.contains(str)) {
                result++
                members.add(str)
            }
        }
    }
    println(result)
}