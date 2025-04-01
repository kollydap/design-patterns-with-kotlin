package command.textEditor

import command.FileOps

class TextEditor {
    private   val editorsContent : MutableList<String> = mutableListOf()

    fun storeText(text: String) {

        editorsContent.add(text)
        println(editorsContent)
        println("storing text")
    }
    fun modifyText() {
        println("modifying text")
    }
    fun deleteText() {
        editorsContent.removeAt(0)
        println("deleting text $editorsContent")
    }

}