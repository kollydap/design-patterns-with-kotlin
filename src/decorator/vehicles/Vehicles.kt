package decorator.vehicles

abstract class Vehicles {
    abstract fun getPrice(): Int
    abstract fun getSpeed(): Int
    open val description: String = "Vehicles"

}