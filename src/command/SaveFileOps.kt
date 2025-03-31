package command

class SaveFileOps(private val file: File) : FileOps {
    override fun execute(): String {
        return file.save()
    }
}