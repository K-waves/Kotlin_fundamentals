fun main() {
    val myFirstDice = dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")

    val mySecondDice = dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}")
}

class dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}