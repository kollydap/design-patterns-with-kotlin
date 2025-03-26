package AbstractFactory

class FactoryProducer {
    companion object {
        fun getFactory(isRounded: Boolean): AbstractFactory {
            return if (isRounded) {
                RoundedShapeFactory()
            } else {
                ShapeFactory()
            }
        }
    }
}