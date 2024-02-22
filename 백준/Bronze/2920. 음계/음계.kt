fun main(){
    val ascending = "1 2 3 4 5 6 7 8"
    val descending = "8 7 6 5 4 3 2 1"

    when (readln()) {
        ascending -> println("ascending")
        descending -> println("descending")
        else -> println("mixed")
    }
}