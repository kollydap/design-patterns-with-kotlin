package bridge.vehicle.solution

class Truck(override val assembleWorkshop: Workshop, override val produceWorkshop: Workshop) : Vehicle() {
    override fun manufacture() {
        assembleWorkshop.work()
        produceWorkshop.work()
    }
}