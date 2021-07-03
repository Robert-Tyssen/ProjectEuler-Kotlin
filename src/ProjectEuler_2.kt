fun main() {
    println("Project Euler #2")
    println(sumEvenFibonacci(4_000_000))
}

fun sumEvenFibonacci(max: Int):Long {

    var fib1 = 1
    var fib2 = 2
    var sum = 2L

    while (fib2 < max) {
        val temp = fib1
        fib1 = fib2
        fib2 += temp

        if (fib2 % 2 == 0) sum += fib2
    }

    return sum
}