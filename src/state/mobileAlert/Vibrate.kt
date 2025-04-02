package state.mobileAlert

class Vibrate :MobileAlertState {
        override fun push(mobile: Mobile) {
            mobile.mobileAlertState = this
            println("vibrate pushing alert")
        }

}