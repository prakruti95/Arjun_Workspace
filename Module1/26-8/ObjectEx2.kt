package com.a268

class ObjectEx2
{
    var id=1
    var name=""
    var city=""
    var salary=123.456


    fun detail()
    {
        println("Your id is $id")
        println("Your name is $name")
        println("Your city is $city")
        println("Your salary is $salary")
    }

}
fun main()
{
    var o1 = ObjectEx2()

    println("Enter your ID")
    var i1= readLine()!!.toInt()

    println("Enter your NAME")
    var n1= readLine().toString()

    println("Enter your CITY")
    var c1= readLine().toString()

    println("Enter your SALARY")
    var s1= readLine()!!.toDouble()

    o1.id=i1
    o1.name=n1
    o1.city=c1
    o1.salary=s1
    /*   o1.id=101
    o1.name="Arjun"
    o1.city="Rajkot"
    o1.salary=12212122.44*/



    o1.detail()

}