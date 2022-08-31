fun main()
{
    try
    {
        var data=10/0
        println(data)//error
    }
    catch(e:Exception)
    {
        println(e)
    }
    finally
    {
        println("success")

    }

}