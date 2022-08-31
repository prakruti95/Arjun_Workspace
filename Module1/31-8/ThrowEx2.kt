import java.lang.ArithmeticException

fun validate(age:Int)
{
    if(age>18)
    {
        println("Eligible to vote")
    }
    else
    {
       throw ArithmeticException("Not Eligible")
    }


}

fun main()
{
    validate(15)

}