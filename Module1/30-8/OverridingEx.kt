open class Bank
{
    open fun rate():Int
    {
        return 0
    }
}
class Sbi :Bank()
{
    override fun rate():Int
{
    return 7
}

}
class Icici :Bank()
{
    override fun rate():Int
    {
        return 8
    }

}
class Axis :Bank()
{

    override fun rate():Int
    {
        return 9
    }
}
fun main()
{
    var b =Bank()

    b=Sbi()
    println(b.rate())
    b=Icici()
    println(b.rate())
    b=Axis()
    println(b.rate())
}