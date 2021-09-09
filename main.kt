/**
 * class tanpa contructor
 */
class User {}

/**
 * class dengan constructor utama
 */
class User2(val username: String, val password: String) {}

/**
 * class dengan getter setter
 */
data class Mahasiswa(val nama: String, val nim: String){}

/**
 * Object ppada kotlin
 */
object Orang  {
    val nama = "suhada"
}


/**
 * inheritance
 * di kotlin cukup dengan :
 * contoh:
 * subClass:superClass
 * 
 * syarat:
 * - superClass harus memberikan keyword open sebelum nama class
 * - function yg dpt di override juga harus diberikan keyword open
 */
open class Club {
    open fun namaClub(){}
}

class Madrid:Club(){
    override fun namaClub(){
        println("Real Madrid")
    }
}

/**
 * Abstract Class
 */
abstract class Kampus(val tipeKampus: String){}



fun main(){
    println("Hello, World!")
    val user1 = User()
    val user2 = User2("suhada", "password")


    println(user1)
    println(user2)

    println(Orang.nama)

    val madrid = Madrid()
    madrid.namaClub()
}