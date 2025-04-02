package momento

class Originator() {
    private var state: String ?= null


    fun saveStateToMomento() : Momento {
        return Momento(state!!)
    }

    fun setState(state: String) {
        this.state = state
    }
    fun getState() :String? {
        return this.state
    }
//    restoring momento
    fun getStateFromMomento(momento : Momento)   {
        state = momento.state
    }
}