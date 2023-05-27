fun main() {
    val target = readLine()!!.toInt()
    for (i in 1..9){
        println("$target * $i = ${i*target}")
    }
}