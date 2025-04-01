package interpreter

class OrExpression(private val exp1 : Expression, private  val exp2: Expression): Expression {

    override fun interpret(context : String) : Boolean {
        return exp1.interpret(context ) || exp2.interpret(context )
    }
}