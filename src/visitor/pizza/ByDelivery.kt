package visitor.pizza

class ByDelivery : HowTo {
    override fun visit(pizza: Pizza) {
        println(pizza.order())
    }

    override fun toString(): String {
        return "by delivery ${super.toString()}"
    }
}