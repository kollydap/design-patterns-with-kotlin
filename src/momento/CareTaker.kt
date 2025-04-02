package momento

class CareTaker {
    private val momentoList = mutableListOf<Momento>()
    fun addMomento(momento: Momento) {
        momentoList.add(momento)
    }
    fun getMomento(index: Int): Momento {
        return momentoList[index]
    }

}