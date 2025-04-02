package visitor.pizza

class Veggie : Pizza {
    override fun order() : String {
        return "veggie"
    }
}