fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}
    val N = input[0]
    val M = input[1]

    val array = Array(N) {it + 1}.toIntArray()

    repeat(M){
        val input = readLine()!!.split(" ").map{it.toInt()}
        val pointer1 = input[0]-1
        val pointer2 = input[1]-1
        val tmp = array[pointer1]
        array[pointer1] = array[pointer2]
        array[pointer2] = tmp
    }

    println(array.joinToString(" "))
}