import java.io.File
import java.io.FileInputStream

fun main()
{
    var fl: File =File("E://arjun.txt")
    var fis: FileInputStream =FileInputStream(fl)
    var barr: ByteArray = ByteArray(fis.available())
    fis.read(barr)
    var str: String = String(barr)
    println(str)
}