package iterator

interface Container {
    fun getIterator(): MyIterator<String>
}