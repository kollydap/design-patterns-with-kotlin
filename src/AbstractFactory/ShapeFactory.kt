package AbstractFactory

class ShapeFactory : AbstractFactory() {
    override fun getShape(shapeType: String): Shape {
        return when (shapeType.lowercase()){
            "square" ->  Square()
            "triangle" ->  Triangle()
            else ->  throw IllegalArgumentException("Unknown shape type: $shapeType")
        }
    }
}