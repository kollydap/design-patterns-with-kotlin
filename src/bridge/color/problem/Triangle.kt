package bridge.color.problem

class Triangle : Shape() {
    override fun applyColor() {
        val blueTriangle = BlueTriangle()
        val redTriangle = RedTriangle()
        redTriangle.applyColor()
        blueTriangle.applyColor()
    }
}