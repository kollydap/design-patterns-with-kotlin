package decorator.vehicles

class Benz : Vehicles() {
    override fun getPrice(): Int {
        return 80000
    }

    override fun getSpeed(): Int {
        return 500
    }
    override val description: String = "Benz"
}