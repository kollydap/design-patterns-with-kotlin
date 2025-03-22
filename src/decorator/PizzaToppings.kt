package decorator

abstract class PizzaToppings(private val pizza: Pizza) : Pizza() {
    override fun getPrice(): Int {
        return pizza.getPrice()
    }
}