package com.rtyssen.projecteuler.utils

import kotlin.math.sqrt

fun primeSieveUntil(max: Long): List<Long> {

    var sqrtMax = sqrt(max.toDouble())

    var primes = listOf(2L) + (3L until max step 2).toList()
    var limit = primes.filter { it <= sqrtMax }

    limit.forEach {
        primes = primes.filterNot { x -> x != it && x % it == 0L }
    }
    return primes
}

fun getNthPrime(n: Int): Long {

    val primes = linkedSetOf(2L, 3L, 5L, 7L, 11L, 13L)
    var curr = primes.last()

    while (primes.size < n) {
        curr += 2
        if (primes.none { curr % it == 0L }) primes.add(curr)
    }

    return primes.last()
}