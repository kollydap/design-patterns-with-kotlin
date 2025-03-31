package command.fiesSystem

class RestoreCommand(private val receiver: FileSystemReceiver) : FileCommand {
    override fun execute() {
        receiver.restore()
    }
}