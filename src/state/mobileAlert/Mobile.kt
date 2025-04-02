package state.mobileAlert

//set getters and setters
class Mobile  {
    var mobileAlertState : MobileAlertState = Silent()

    fun push(){
        mobileAlertState.push(this)
    }
}