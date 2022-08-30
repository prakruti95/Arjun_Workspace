open class A
{
    fun a()
    {
        println("A Accesssed")
    }
}
open class B :A()
{
    fun b()
    {
        println("B Accesssed")
    }
}
interface  C
{
    fun c()
}
class D :B(),C
{
    fun d()
    {
        println("D Accesssed")
    }

    override fun c()
    {
        println("C Accesssed")
    }
}

fun main()
{
    var d=D()
    d.a()
    d.b()
    d.c()
    d.d()
}