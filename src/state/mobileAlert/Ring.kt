package state.mobileAlert

class Ring : MobileAlertState {
    override fun push(mobile: Mobile) {
        mobile.mobileAlertState = Silent()
        println("ring pushing alert")
    }
}