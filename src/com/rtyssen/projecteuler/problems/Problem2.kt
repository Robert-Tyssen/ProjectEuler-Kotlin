package com.rtyssen.projecteuler.problems

fun problem2():Long {

    val max = 4_000_000
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