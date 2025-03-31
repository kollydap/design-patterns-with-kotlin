package command.textEditor

class TypeCommand(private val textEditor: TextEditor, private val text : String) : TextEditorOps {
    override fun execute() {
        textEditor.storeText(text)
    }

}