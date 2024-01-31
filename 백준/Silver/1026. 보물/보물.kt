fun main(){
    val num = readln().toInt()
    var aList = readln().split(" ").map{it.toInt()}
    val bList = readln().split(" ").map{it.toInt()}
    var result = 0

    val order = hashMapOf<Int, Int>()
    bList.sorted().forEachIndexed { index, i ->
        order[index]=i
    }
    aList = aList.sortedDescending()

    repeat(num){index->
        result += (order[index]!! * aList[index])
    }

    println(result)
}