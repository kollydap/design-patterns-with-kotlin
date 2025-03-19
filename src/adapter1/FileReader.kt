package adapter1

interface FileReader {
    fun readFile(path: String): String
    fun readLines(path: String): List<String>
    fun exists(path: String): Boolean
    fun getSize(path: String): Long
}
