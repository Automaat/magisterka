package com.automaat.cpu_benchmark

import Factorial
import org.openjdk.jmh.annotations.Benchmark
import java.math.BigInteger

open class FactorialBenchmark {

    @Benchmark
    fun calculateFactorial(): BigInteger {
        return Factorial.calculateFactorial(BigInteger.valueOf(1500))
    }
}