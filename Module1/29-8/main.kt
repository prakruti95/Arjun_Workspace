class Person
{
    var name=""
    var surname=""
    var mobile=1
    var email=""
}

fun main()
{
        var city="Rajkot"
        //object

        var p =Person()
        p.name="Xyz"
        p.surname="Abc"
        p.mobile=123456
        p.email="a@gmail.com"

        println("Your Name is ${p.name}  \n Your City is $city")
        println("\n Your Name is ${p.name} \n Your Surname is ${p.surname} \n Your Mobile is ${p.mobile}  \n Your Email is ${p.email}" )

}