  GNU nano 4.8                                                  Coin_flip/main.kt                                                   Modified  
fun main() {
    val coinFlip = Coin()
    println(coinFlip.flip())
}

class Coin {

    fun flip(): String{
        val face = (1..2).random()
        if(face == 1) {
            return "Heads"
        } else {
            return "Tails"
        }
    }
}
