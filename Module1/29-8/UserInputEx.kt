class UserInputEx
{

    fun detail()
    {

        println("Enter your Name")
        var name= readLine()

        println("Enter your Surname")
        var surname= readLine()

        println("Enter yout Email")
        var emai= readLine()

        println("Your name is $name")


    }


}
fun main()
{
    var u1= UserInputEx()
    u1.detail()

}