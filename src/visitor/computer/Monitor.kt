package visitor.computer

class Monitor : ComputerPart {
    override fun accept(visitor: ComputerPartVisitor) {
        visitor.visit(this)
    }
}