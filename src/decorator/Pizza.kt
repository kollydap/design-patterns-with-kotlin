package decorator

abstract class Pizza {
    abstract fun getPrice(): Int
    val description : String = "Pizza"

}