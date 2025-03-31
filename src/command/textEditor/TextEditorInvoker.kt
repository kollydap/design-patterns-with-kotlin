package command.textEditor

class TextEditorInvoker() {
    private final  val commands : MutableList<TextEditorOps> = mutableListOf()
    fun execute(command: TextEditorOps) {
        command.execute()
        commands.add(command)
    }
    fun undo(){
//
    }


}