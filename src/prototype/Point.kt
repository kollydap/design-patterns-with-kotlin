package prototype

class Point(private val x :Int, private val y:Int ) : Shape {

    fun getAx ():Int{
        return x+ 20
    }
    fun getBy ():Int{
        return y+ 50
    }

    override fun clone(): Shape {
        return Point(x, y)
    }

}