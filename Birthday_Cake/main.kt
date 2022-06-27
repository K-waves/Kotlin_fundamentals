val name = ""
val age =
val layers =
val border = "$" //sets border of message
val lookTop = "=" //sets design of top layer
val lookBottom = "#" //sets design for bottom

fun main() {
    printMessage()
    printCakeCandles(age)
    printCakeTop(age, lookTop)
    printCakeBottom(age, layers, lookBottom)
}
fun printMessage() {
    printBorder(border)
    println(" Happy Birthday $name!")
    printBorder(border)
}

//prints the candles
fun printCakeCandles(age: Int) {
    //the flame
    print("  ") //inset of the flame
    repeat(age) {
        print(",")
    }
    println() // prints new line

    //candle sticks
    print("  ") //inset of the candle stick
    repeat(age) {
        print("|")
    }
    println() //new line
}

//prints top of cake
fun printCakeTop(age: Int, lookTop: String) {
    print(" ")
    repeat(age + 2) {
        print(lookTop)
    }
    println()
}

//prints bottom of cake
fun printCakeBottom(age: Int, layers: Int, lookBottom: String) {
    repeat(layers) {
        repeat(age + 4) {
            print(lookBottom)
        }
        println()
    }
}

//prints border of message
fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}
