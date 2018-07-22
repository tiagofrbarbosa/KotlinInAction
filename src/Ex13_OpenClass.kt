import interfaces.Clickable

open class RichButton : Clickable  {

    fun disable() = println("this function is final")
    open fun animate() = println("this function is open")
    override fun click() = println("this function is open")
    final override fun showOff() = println("this function is close")
}

fun main(args: Array<String>) {

    val button = RichButton()
    button.disable()
    button.animate()
    button.click()
    button.showOff()
}