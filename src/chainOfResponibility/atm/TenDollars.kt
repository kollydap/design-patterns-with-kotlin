package chainOfResponibility.atm

class TenDollars : MoneyDistributorChain {
    private var nextChain : MoneyDistributorChain ?= null
    override fun setNextMoneyDistributorChain(chain: MoneyDistributorChain) {
        this.nextChain = chain
    }

    override fun calculate(amount: Int) {
       if (amount < 10) return
        if (amount  in 10..19 ) {
            println("dispensing money")
        } else{
            nextChain?.calculate(amount)
        }

    }
}