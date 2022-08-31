class MyException
{
    fun error()
    {
        println("Your Age is not valid")
    }
}
fun main()
{

    var c=MyException()
    c.error()
}