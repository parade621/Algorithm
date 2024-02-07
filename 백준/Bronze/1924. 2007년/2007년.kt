fun main(){
    val (x, y) = readln().split(" ").map { it.toInt() }
    var period = 0
    for (i in 1 until x ){
        when (i) {
            1,3,5,7,8,10,12 -> period += 31
            2-> period += 28
            else -> period += 30
        }
    }
    when((period + y) % 7){
        1 -> println("MON")
        2 -> println("TUE")
        3 -> println("WED")
        4 -> println("THU")
        5 -> println("FRI")
        6 -> println("SAT")
        0 -> println("SUN")
    }
}