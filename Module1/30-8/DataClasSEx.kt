data class Tops(var name : String, var id : Int)
{

}
fun main()
{
    var t1 =Tops("abc",101)
    var t2=Tops("abc",102)
    println(t1)
    println(t2)
    if(t1==t2)
    {

        println("True")
    }
    else
    {
        println("False")
    }

    var t3 = t1.copy()
    println(t3)
    var t4 = t1.copy(name = "Tops")// copy data of user1
    println(t4)

}