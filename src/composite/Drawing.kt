package composite

class Drawing : Shape {

    private val shapes : MutableList <Shape> = mutableListOf()
    fun add(shape : Shape) {
        shapes.add(shape)
    }
    fun remove(shape : Shape) {
        shapes.remove(shape)
    }

    override fun draw() {
        for (shape in shapes) {
            shape.draw()
        }
    }

}