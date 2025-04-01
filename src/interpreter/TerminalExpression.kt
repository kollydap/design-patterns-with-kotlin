package interpreter

class TerminalExpression(private val data : String) : Expression {
    override fun interpret(context : String) : Boolean {
        return (context.contains(data))
    }
}