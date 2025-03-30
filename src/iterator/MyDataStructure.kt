package iterator

class MyDataStructure : Container {
    private val employees: MutableList<String> = mutableListOf("kola", "osaze")

    override fun getIterator(): MyIterator<String> {
        return ElementIterator(employees)
    }

    class ElementIterator(private val employees: MutableList<String>) : MyIterator<String> {
        private var index: Int = 0
        private var lastReturnedIndex: Int = -1  // Tracks the last accessed element

        override fun hasNext(): Boolean {
            return index < employees.size
        }

        override fun next(): String {
            if (!hasNext()) throw NoSuchElementException()
            lastReturnedIndex = index
            return employees[index++]
        }

        override fun remove() {
            if (lastReturnedIndex == -1) throw IllegalStateException("Call next() before remove()")
            employees.removeAt(lastReturnedIndex)
            index = lastReturnedIndex // Adjust index after removal
            lastReturnedIndex = -1  // Reset
        }
    }
}