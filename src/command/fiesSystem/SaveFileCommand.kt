package command.fiesSystem

class SaveFileCommand(private val receiver: FileSystemReceiver ) : FileCommand {
    override fun execute() {
        receiver.save()
    }

}