class PrimaryConstructorEx(var id:Int , var name:String)
{
    fun display()
    {
        println("Your id is $id")
        println("Your name is $name")
    }
}
fun main()
{
    var p1 =PrimaryConstructorEx(101,"xyz")
    var p2 =PrimaryConstructorEx(102,"abc")
    p1.display()
    p2.display()
}