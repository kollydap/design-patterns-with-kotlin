package interpreter.sql

import com.sun.rowset.internal.Row

class Context {
    companion object {
        public val tables : Map<String, List<Row>>  = HashMap<String, List<Row>>()
        @JvmStatic
        private final val list : MutableList<Row> = mutableListOf()

    }

    private val table : String = ""
    private val column : String = ""


}
