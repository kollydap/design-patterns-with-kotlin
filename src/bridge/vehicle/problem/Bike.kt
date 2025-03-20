package bridge.vehicle.problem

class Bike : Vehicle() {
    override fun manufacture() {
        val produceWorkshop = BikeProduceWorkshop()
        val paintWorkshop = BikePaintWorkshop()
        val assembleWorkshop = BikeAssembleWorkshop()
        produceWorkshop.produce()
        paintWorkshop.paint()
        assembleWorkshop.assemble()
    }
}