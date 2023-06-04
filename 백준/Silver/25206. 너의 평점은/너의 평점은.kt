fun main(){
    var cnt:Float = 0f
    var result: Float = 0f
    val rate = HashMap<String, Float>()
    rate["A+"] = 4.5f
    rate["A0"] = 4.0f
    rate["B+"] = 3.5f
    rate["B0"] = 3.0f
    rate["C+"] = 2.5f
    rate["C0"] = 2.0f
    rate["D+"] = 1.5f
    rate["D0"] = 1.0f
    rate["F"] = 0.0f

    repeat(20){
        val (obj, credit, rating) = readLine()!!.split(" ").map{it.toString()}
        if(rating != "P"){
            cnt += credit.toFloat()
            result += (credit.toFloat() * rate[rating]!!)
        }
    }
    println(String.format("%.6f",result / cnt))
}