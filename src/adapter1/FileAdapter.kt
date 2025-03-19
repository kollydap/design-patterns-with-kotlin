package adapter1

class FileAdapter(private val  fileReader: FileReader, private val jsonFileReader: JsonFileReader) {

    fun readJson(path: String): Map<String, Any> {
        return jsonFileReader.readJson(path)
    }

    fun readJsonArray(path: String): List<Map<String, Any>> {
        return jsonFileReader.readJsonArray(path)
    }

    fun exists(path: String): Boolean {
        return fileReader.exists(path)
    }

    fun getSize(path: String): Long {
        return fileReader.getSize(path)
    }

}