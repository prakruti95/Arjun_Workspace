import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main()
{
    var s=Student(101,"Abc")
    var fout=FileOutputStream("E://xyz.txt")
    var obj=ObjectOutputStream(fout)
    obj.writeObject(s)
    println("Success")
}