fun main(){
    val input = readLine()!!.toInt()
    val cnt = (input-4)/4
    var result = ""
    for(i in 0 until cnt) {
        result += "long"+ " "
    }
    result += "long int"
    println(result)
}