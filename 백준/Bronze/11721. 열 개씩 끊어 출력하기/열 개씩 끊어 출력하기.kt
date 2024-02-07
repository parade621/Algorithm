fun main(){
    val str = readln()
    var result = ""
    for (i in str.indices){
        result += str[i]
        if(result.length == 10){
            println(result)
            result = ""
        }
    }
    println(result)
}