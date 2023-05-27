fun main(){
    val caseSize = readln().toInt()
    for (i in 0 until caseSize){
        val sum = readln().split(" ").map{it.toInt()}.sum()
        println(sum)
    }
}