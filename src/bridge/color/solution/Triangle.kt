package bridge.color.solution

class Triangle() : Shape() {

    fun applyColor() {
        super.applyColor(Red())
        super.applyColor(Red())
    }
}