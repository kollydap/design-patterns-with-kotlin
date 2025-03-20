package bridge.vehicle.solution

abstract class Vehicle {
    abstract val assembleWorkshop :Workshop
    abstract val produceWorkshop :Workshop

    abstract fun manufacture()

}