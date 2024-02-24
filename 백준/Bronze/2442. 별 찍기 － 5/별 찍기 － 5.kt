fun main(){
    val n = readln().toInt()

    repeat(n){index ->
        for (i in n-index downTo 2){
            print(" ")
        }
        for (j in 0 until index){
            print("*")
        }
        for (k in 0..index){
            print("*")
        }
        println()
    }
}