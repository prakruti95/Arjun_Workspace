import java.io.FileOutputStream

fun main()
{
    //FileOutputStream-write
    //FileInputStream-read
    var s="Welcome to Tops"
    var fout =FileOutputStream("E://arjun.txt")
    fout.write(s.toByteArray())
    println("success")
}