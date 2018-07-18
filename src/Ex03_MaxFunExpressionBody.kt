

fun main(args: Array<String>){
    println(max(1,2))
}


/*

//block body
fun max(a: Int, b: Int): Int{
    return if(a > b) a else b
}*/


//expression body
fun max(a:Int, b: Int): Int = if (a > b) a else b

