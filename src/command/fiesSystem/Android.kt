package command.fiesSystem

class Android : FileSystemReceiver {
    override fun save() {
        println("savin on an android")
    }

    override fun read() {
        println("reading on an android")
    }

    override fun restore() {
        println("restoring on an android")
    }

    override fun delete() {
        println("deleting on an android")
    }

}