fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    val array = Array(input[0]) { 0 }.toIntArray()
    repeat(input[1]){
        val input2 = readLine()!!.split(" ").map { it.toInt() }
        val i = input2[0]-1
        val j = input2[1]-1
        val k = input2[2]

        for(t in i..j){
            array[t] = k
        }
    }
    println(array.joinToString(" "))
}