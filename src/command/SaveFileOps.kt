package command

class SaveFileOps(private val fileName : String) : FileOps {
    private var file =  File(fileName)
    override fun execute() :String {
        return file.save()
    }
}