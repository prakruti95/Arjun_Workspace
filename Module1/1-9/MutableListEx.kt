package a1

//add,addall,removeAt,removeall,retainall

fun main()
{
    var m= mutableListOf(1,2,3)

    m.add(4)

    var m2= mutableListOf(1,2,3)

    /*m.addAll(m2)
    m.removeAt(0)
    m.removeAll(m2)*/
    m.retainAll(m2)

    for(element in  m)
    {
        println(element)
    }
}