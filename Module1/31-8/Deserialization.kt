import java.io.FileInputStream
import java.io.ObjectInputStream

fun main()
{
    var obj=ObjectInputStream(FileInputStream("E://xyz.txt"))
    var s:Student= obj.readObject() as Student
    println("${s.id} , ${s.name}")
}