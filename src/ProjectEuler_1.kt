fun main() {
    println("Project Euler #1")
    println(sumMultiplesBelow(listOf(3, 5), 1000))
}

fun sumMultiplesBelow(multiples: List<Int>, max: Int):Int {

    var sum = 0

    for (x in 1 until max) {
        if (multiples.any { m -> x % m == 0 }) sum += x
    }

    return sum
}