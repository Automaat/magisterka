package com.automaat.cpu_benchmark

import calculateFactorial
import org.openjdk.jmh.annotations.Benchmark
import java.math.BigInteger

open class FactorialBenchmark {

    @Benchmark
    fun calculateFactorial() {
        calculateFactorial(BigInteger.valueOf(1000))
    }
}