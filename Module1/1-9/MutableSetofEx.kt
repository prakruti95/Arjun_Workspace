package a1

fun main()
{
    var m= mutableSetOf(1,2,3)

    m.add(4)

    var m2= mutableSetOf(1,2,3)

    m.addAll(m2)
  //  m.removeAt(0)
   // m.removeAll(m2)
   // m.retainAll(m2)

    for(element in  m)
    {
        println(element)
    }
}