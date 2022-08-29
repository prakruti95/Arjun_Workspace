interface P
{
   fun p()
}
interface Q
{
    fun q()
}
class R :P,Q
{
    override fun p() {
        println("P")
    }

    override fun q() {
       println("Q")
    }

}
fun main()
{
    var r =R()

    r.p()
    r.q()
}