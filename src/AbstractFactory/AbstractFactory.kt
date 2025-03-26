package AbstractFactory

abstract class AbstractFactory {
    abstract fun getShape(shapeType : String): Shape
}