package command

class OpenFileOps(private val fileName: String): FileOps {
    private var file =  File(fileName)
    override fun execute(): String {
        return file.open()
    }
}