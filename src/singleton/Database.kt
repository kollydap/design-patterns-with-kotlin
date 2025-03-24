package singleton

class Database private constructor() {
    companion object {
        @Volatile
        private var instance: Database? = null

        @JvmStatic
        fun getInstance(): Database {
            return instance ?: synchronized(this) {
                instance ?: Database().also { instance = it }
            }
        }
    }
}
