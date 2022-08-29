class ObjectEx2
{
    var name=""
    var surname=""
    var email=""
    var id=1

    fun detail()
    {
        println("\n Your name is $name \n Your Surname is $surname \n Your Email is $email \n Your id is $id")
    }

}
fun main()
{
    var o1 =ObjectEx2()

    o1.name="a"
    o1.surname="b"
    o1.email="a"
    o1.id=1

    o1.detail()

}