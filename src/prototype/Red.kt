package prototype

class Red(private val color : String) : Color {
    override fun applyColor() {
        println("applying color")
    }
}