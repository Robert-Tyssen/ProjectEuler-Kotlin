// Correct answer 997651

fun main() {
    problem50()
}

fun problem50() {

    val upperLimit = 1_000_000L

    var primes = primeSieveUntil(upperLimit)
    var summablePrimes = primes.filter { it <= upperLimit / 2 }
    var runLengths = (2 until summablePrimes.size).toList().asReversed()

    runLengths.forEach { runLen ->

        var sum = 0L
        (0 until runLen).forEach { sum += summablePrimes[it] }

        (1 until (summablePrimes.size - runLen)).forEach sum@ {
            sum -= summablePrimes[it - 1]
            sum += summablePrimes[runLen + it - 1]

            if (sum > primes.last()) return@sum

            if (primes.contains(sum)) {
                println("${sum} ${runLen}")
                return
            }
        }

    }

}

