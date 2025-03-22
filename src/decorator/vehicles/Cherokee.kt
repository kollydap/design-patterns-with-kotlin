package decorator.vehicles

class Cherokee : Vehicles() {
    override fun getPrice(): Int {
        return 50000
    }

    override fun getSpeed(): Int {
        return 200
    }
    override val description: String = "Cherokee"
}