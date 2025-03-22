package decorator.vehicles

class MichelinTyres(vehicle: Vehicles):VehicleDecorator( vehicle ) {
    override fun getPrice(): Int {
        return super.getPrice() + 900
    }

    override fun getSpeed(): Int {
        return super.getSpeed() + 800
    }

    override val description: String
        get() = vehicles.description + "on michelin"
}