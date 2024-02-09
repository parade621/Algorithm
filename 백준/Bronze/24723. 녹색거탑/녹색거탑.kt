fun main() {
    val num = readln().toInt()
    var result = 1
    for (i in 1..num){
        result *= 2
    }
    println(result)
}