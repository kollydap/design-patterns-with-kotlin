package chainOfResponibility.atm

class TwentyDollars : MoneyDistributorChain {
    private var nextChain : MoneyDistributorChain ?= null
    override fun setNextMoneyDistributorChain(chain: MoneyDistributorChain) {
        this.nextChain = chain
    }

    override fun calculate(amount: Int) {
        if (amount < 10) return
        if (amount  in 20..29 ) {
            println("dispensing money")
        } else{
            nextChain?.calculate(amount)
        }

    }
}