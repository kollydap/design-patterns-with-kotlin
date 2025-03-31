package command

class OpenFileOps(private val file: File): FileOps {
    override fun execute(): String {
        return file.open()
    }
}