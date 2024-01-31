fun main() {
    val num = readln().toInt()
    val list = ArrayDeque<Pair<Int, String>>()

    repeat(num) {
        val (age, name) = readln().split(" ")
        list.addLast(age.toInt() to name)
    }
    list.sortBy { it.first }

    list.forEach {
        println("${it.first} ${it.second}")
    }
}