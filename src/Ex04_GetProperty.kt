

fun main(args: Array<String>){

    val rectangle = Rectangle(42,42)
    println(rectangle.isSquare)
}

class Rectangle(val height: Int, val width: Int){

    val isSquare: Boolean get(){
            return height == width
        }
}