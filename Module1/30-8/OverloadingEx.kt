class OverloadingEx
{
    companion object
    {
        fun cal(a:Int,b:Int):Int
        {
            return  a+b
        }
        fun cal(a:Int,b:Int,c:Int):Int
        {
            return  a*b*c
        }
    }

}
fun main()
{
    //var o1 =OverloadingEx()
    println(OverloadingEx.cal(5,6))
    println(OverloadingEx.cal(5,6,7))

}