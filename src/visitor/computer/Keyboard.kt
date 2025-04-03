package visitor.computer

class Keyboard : ComputerPart {
    override fun accept(visitor: ComputerPartVisitor) {
        visitor.visit(this)
    }
}