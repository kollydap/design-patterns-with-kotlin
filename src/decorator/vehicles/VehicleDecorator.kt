package decorator.vehicles

abstract class VehicleDecorator(protected val vehicles: Vehicles) : Vehicles() {
    override fun getPrice(): Int {
        return vehicles.getPrice()
    }

    override fun getSpeed(): Int {
        return vehicles.getSpeed()
    }
}