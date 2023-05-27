fun main(){
    val target = readLine()!!.toLong()
    var result = 0L
    for (i in 0 .. target){
        result += i
    }
    println(result)
}