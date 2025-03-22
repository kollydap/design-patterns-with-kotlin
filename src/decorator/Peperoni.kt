package decorator

class Peperoni : Pizza() {
    override fun getPrice(): Int {
        return 10
    }

}