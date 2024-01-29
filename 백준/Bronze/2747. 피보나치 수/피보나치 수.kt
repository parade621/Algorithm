fun fibo(target: Int): Int {
    if ( target <= 1){
        return target
    }

    var num1 = 0
    var num2 = 1
    var sum = 0
    for (i in 2..target){
        sum = num1 + num2
        num1 = num2
        num2 = sum
    }
    return sum
}

fun main() {
    val input = readln().toInt()
    println(fibo(input))
}