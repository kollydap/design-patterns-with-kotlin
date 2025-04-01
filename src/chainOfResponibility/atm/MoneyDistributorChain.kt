package chainOfResponibility.atm

interface MoneyDistributorChain {
    fun setNextMoneyDistributorChain(chain: MoneyDistributorChain)
    fun calculate(amount :Int )
}