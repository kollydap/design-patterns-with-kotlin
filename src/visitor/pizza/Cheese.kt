package visitor.pizza

class Cheese : Pizza {
    override fun order() : String {
        return "cheese"
    }
}