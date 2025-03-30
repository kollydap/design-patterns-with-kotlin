package command

//Receiver class that performs the action/ command
class File(private val fileName: String) {
    fun open():String {
        return  "opening $fileName"
    }
    fun save():String {
        return "saving $fileName"
    }
}