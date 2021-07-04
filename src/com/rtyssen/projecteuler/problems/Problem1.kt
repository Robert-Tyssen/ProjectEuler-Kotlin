package com.rtyssen.projecteuler.problems

fun problem1():Int {

    val multiples = listOf(3, 5)
    val max = 1000
    val sum = (1 until max).filter { x ->
        multiples.any { m->
            x % m == 0
        }
    }.sum()

    return sum
}