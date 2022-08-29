class SecondaryConstructorEx
{
    constructor(id:Int)
    {
        println("$id")
    }
    constructor(id:Int,name:String)
    {
        println("$id , $name")
    }

}
fun main()
{
    var s1 =SecondaryConstructorEx(101)
    var s2=SecondaryConstructorEx(101,"a")

}