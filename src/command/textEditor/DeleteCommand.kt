package command.textEditor

class DeleteCommand(private val textEditor: TextEditor): TextEditorOps {
    override fun execute() {
        textEditor.deleteText()
    }
}