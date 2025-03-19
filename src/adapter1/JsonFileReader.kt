package adapter1

interface JsonFileReader {
    fun readJson(path: String): Map<String, Any>
    fun readJsonArray(path: String): List<Map<String, Any>>
    fun exists(path: String): Boolean
    fun getSize(path: String): Long
}
