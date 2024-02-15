fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(m)
    val isUsed = BooleanArray(n)
    val sb = StringBuilder()
    fun dfs(index: Int, start: Int){
        if(index == m){
            sb.append(arr.joinToString(" ") + "\n")
            return
        }
        for(i in start until n){
            if(!isUsed[i]){
                isUsed[i] = true
                arr[index] = i + 1
                dfs(index + 1, i + 1)
                isUsed[i] = false
            }
        }
    }
    dfs(0, 0)
    print(sb)
}