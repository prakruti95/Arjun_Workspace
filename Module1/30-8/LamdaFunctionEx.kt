class MyFirstClass1
{
    fun addTwoNum1(a: Int , b : Int,action: (Int) ->Unit)
    {
        val sum = a+b
        action(sum)
    }
}
fun main()
{
    val my = MyFirstClass1()
    val myLambda : (Int) -> Unit={s : Int ->println(s)}
    my.addTwoNum1(2,7,myLambda)

}