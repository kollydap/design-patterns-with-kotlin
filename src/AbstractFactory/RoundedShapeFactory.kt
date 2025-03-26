package AbstractFactory

class RoundedShapeFactory : AbstractFactory(){
    override fun getShape(shapeType : String): Shape {
        return when (shapeType.lowercase()){
            "square" ->  RoundedSquare()
            "triangle" ->  RoundedTriangle()
            else ->  throw IllegalArgumentException("Unknown shape type: $shapeType")
        }
    }
}