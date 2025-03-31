package chainOfResponibility

interface Chain {
    fun setNextChain(nextChain: Chain)
    fun calculate (request : Numbers)
}