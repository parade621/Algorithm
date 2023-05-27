fun main(){
    var price = readLine()!!.toLong()
    val items = readLine()!!.toInt()
    repeat(items){
        val item = readLine()!!.split(" ").map{it.toLong()}
        price -= (item[0] * item[1])
    }

    if(price != 0L){
        println("No")
    }else{
        println("Yes")
    }
}