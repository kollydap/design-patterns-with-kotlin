package factory

class ShapeFactory {
    fun getShape(shapeType: String): Shape {
        return when (shapeType.lowercase()) {
            "triangle" -> Triangle()
            "square" -> Square()
            else -> throw IllegalArgumentException("Unknown shape type: $shapeType")
        }
    }
}
