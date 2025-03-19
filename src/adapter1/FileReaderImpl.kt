package adapter1

import java.io.File

class FileReaderImpl : FileReader {

    override fun readFile(path: String): String {
        val file = File(path)
        if (!file.exists()) {
            throw IllegalArgumentException("File not found: $path")
        }
        return file.readText()
    }

    override fun readLines(path: String): List<String> {
        val file = File(path)
        if (!file.exists()) {
            throw IllegalArgumentException("File not found: $path")
        }
        return file.readLines()
    }

    override fun exists(path: String): Boolean {
        return File(path).exists()
    }

    override fun getSize(path: String): Long {
        val file = File(path)
        if (!file.exists()) {
            throw IllegalArgumentException("File not found: $path")
        }
        return file.length()
    }
}
