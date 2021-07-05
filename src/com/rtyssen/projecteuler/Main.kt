package com.rtyssen.projecteuler

import com.rtyssen.projecteuler.problems.*
import java.lang.Exception
import kotlin.system.measureTimeMillis

fun main(){

    val problemNumber = 7
    var res = ""

    println("\n********** PROJECT EULER **********\n")
    println("Executing problem # ${problemNumber}")

    val f = getFunctionForProblem(problemNumber)
    val millis = measureTimeMillis { res = f().toString() }

    println("Result = $res")
    println("Execution time = $millis ms")
    println("\n********** COMPLETE **********\n")

}

// Get the function for the inputted value n
// TODO - would reflection be better for this?
private fun getFunctionForProblem(n: Int): () -> Any = when (n) {
    // Map input number to executable function
    1  -> ::problem1
    2  -> ::problem2
    6  -> ::problem6
    7  -> ::problem7
    50 -> ::problem50

    // No executable function found, return generic message
    else -> {
        fun() = "PROBLEM NOT IMPLEMENTED"
    }

}