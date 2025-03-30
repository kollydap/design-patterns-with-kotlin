package iterator

interface MyIterator<T> {
    fun hasNext(): Boolean
    fun next(): T
    fun remove()
}
