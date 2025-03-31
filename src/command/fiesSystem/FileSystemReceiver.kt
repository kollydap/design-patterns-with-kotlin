package command.fiesSystem

interface FileSystemReceiver {
    fun save()
    fun read()
    fun restore()
    fun delete()
}