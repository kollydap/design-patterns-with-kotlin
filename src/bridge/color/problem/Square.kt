package bridge.color.problem

class Square : Shape() {
    override fun applyColor() {
        val blueSquare = BlueSquare()
        blueSquare.applyColor()
    }
}