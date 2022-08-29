open class A
{
    fun a1()
    {
        println("A Executed")
    }
}
class B : A()
{
    fun b1()
    {
        println("B Executed")
    }
}

fun main()
{
    var b  = B()
    b.a1()
    b.b1()
}