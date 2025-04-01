package interpreter.sql

interface Expression {
    fun interpret () : List<String>
}