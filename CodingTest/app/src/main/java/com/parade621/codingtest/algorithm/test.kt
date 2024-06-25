
fun main(){
    val str = "3people unFollowed me"
    val str2 = "3people  unFollowed  me"
    val s = "                          "
    println(str.split(" "))
    println(str2.split(" "))

    var answer = ""
    var list = arrayListOf<String>()
    var word = ""
    for(i in s.indices){
        if(s[i] != ' '){
            word += s[i]
        }else if(s[i] == ' '){
            if(word.isNotEmpty()){
                list.add(word)
                word = ""
            }
            list.add(" ")
        }
    }
    list.add(word)
    println(list)
    list.forEach{
        answer += if(it.isNotBlank()){
            it.first().uppercase() + it.substring(1).lowercase()
        }else{
            it
        }
    }
    println(answer)
}