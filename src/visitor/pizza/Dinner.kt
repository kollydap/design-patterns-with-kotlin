package visitor.pizza

interface Dinner {
    fun getDinner(): Pizza
    fun howToDeliver(): HowTo
}