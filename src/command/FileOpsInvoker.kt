package command

class FileOpsInvoker {
    private final  val operations : MutableList<FileOps> = mutableListOf()
    fun executeOperations(operation: FileOps):String {
        operations.add(operation)
        return operation.execute()
    }

}