package bridge.vehicle.problem

class Car: Vehicle() {
    override fun manufacture() {
        val carAssembleWorkshop = CarAssembleWorkshop()
        val carPaintWorkshop = CarPaintWorkshop()
        val carProduceWorkshop = CarProduceWorkshop()
        carProduceWorkshop.Produce()
        carPaintWorkshop.Paint()
        carAssembleWorkshop.Assemble()
    }
}