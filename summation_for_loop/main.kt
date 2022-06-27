fun summation(n:Int): Int{
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    println(summation(8))
}