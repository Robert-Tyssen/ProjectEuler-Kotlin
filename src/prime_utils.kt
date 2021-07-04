import kotlin.math.sqrt

fun main() {
    println(primeSieveUntil(1000000))
}


fun primeSieveUntil(max: Long): List<Long> {

    var sqrtMax = sqrt(max.toDouble())

    var primes = listOf(2L) + (3L until max step 2).toList()
    var limit = primes.filter { it <= sqrtMax }

    limit.forEach {
        primes = primes.filterNot { x -> x != it && x % it == 0L }
    }
    return primes
}