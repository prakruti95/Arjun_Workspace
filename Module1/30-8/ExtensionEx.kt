class MyFirstClass
{
    fun haspassed(marks : Int):Boolean
    {
        return marks>40
    }
}
fun MyFirstClass.isscholar(marks: Int):Boolean
{
    return marks> 90
}
fun main()
{
    var my = MyFirstClass()
    println("Pass Status: "+my.haspassed(99))
    println("scholarship status: "+my.isscholar(99))

}