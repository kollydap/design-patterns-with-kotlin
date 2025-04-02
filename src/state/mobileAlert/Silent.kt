package state.mobileAlert

class Silent : MobileAlertState {
    override fun push(mobile: Mobile) {
        mobile.mobileAlertState = this
        println("Silent pushing alert")
    }
}