class Person
{
    fun detail()
    {
        println("Your detail accessed")
    }
    fun detail2()
    {
        println("Your detail2 accessed")
    }
    fun detail3()
    {
        println("Your detail3 accessed")
    }

}
fun main()
{
    var p1 = Person()
    p1.detail()
    p1.detail2()
    p1.detail3()
}