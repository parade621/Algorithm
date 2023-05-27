fun main(){
    val input= readLine()!!.split(" ").map{it.toLong()}
    var result =0L
    for (i in input){
       result += i
    }
    println(result)
}