package decorator

class ExtraCheese(pizza: Pizza) : PizzaToppings(pizza) {
    override fun getPrice(): Int {
        return super.getPrice() + 3  // Adding extra cheese cost
    }
}