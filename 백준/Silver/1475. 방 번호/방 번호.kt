fun main() {
    val str = readln()
    var sixNine = 0
    var numSet = MutableList(10) { 0 }

    repeat(str.length) {
        val num = str[it].digitToInt()
        if (num == 6 || num == 9) {
            sixNine++
        }
        numSet[num]++
    }

    if (sixNine % 2 == 0) {
        numSet[6] = sixNine / 2
        numSet[9] = sixNine / 2
    } else {
        numSet[6] = sixNine / 2 + 1
        numSet[9] = sixNine / 2 + 1
    }

    println(numSet.max())
}