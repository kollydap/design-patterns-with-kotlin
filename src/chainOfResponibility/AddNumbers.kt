package chainOfResponibility

class AddNumbers : Chain {
    private var nextChain: Chain? = null
    override fun setNextChain(nextChain: Chain) {
        this.nextChain = nextChain
    }

    override fun calculate(request: Numbers) {
        if (request.operationName == "add") {
            println("${request.num1} + ${request.num2} = ${request.num1 +   request.num2}")
        }
        else{
            nextChain?.calculate(request)
        }
    }
}