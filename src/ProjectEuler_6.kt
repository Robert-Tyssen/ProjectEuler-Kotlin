// Answer = 25164150

fun main() {
    println("Project Euler #6")
    println(problem6())
}

fun problem6():Int {

    val min = 1
    val max = 100

    val sumSq = (min..max).map { it * it }.sum()

    var sqSum = (min..max).sum()
    sqSum *= sqSum

    return sqSum - sumSq

}