package visitor.computer


//Element
interface ComputerPart {
    fun accept(visitor: ComputerPartVisitor)
}