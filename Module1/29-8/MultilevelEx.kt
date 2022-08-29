open class A1
{
    fun a1()
    {
        println("A Executed")
    }
}
open class B1 : A1()
{
    fun b1()
    {
        println("B Executed")
    }
}
class C1 :B1()
{
    fun c1()
    {
        println("C Executed")
    }
}
fun main()
{
    var c= C1()
    c.a1()
    c.b1()
    c.c1()

}