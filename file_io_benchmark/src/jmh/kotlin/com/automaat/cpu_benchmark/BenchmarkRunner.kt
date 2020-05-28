package com.automaat.cpu_benchmark

import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.Options

import org.openjdk.jmh.runner.options.OptionsBuilder


fun main() {
    val opt: Options = OptionsBuilder()
        .include(FileIoBenchmark::class.java.simpleName)
        .forks(1)
        .build()

    Runner(opt).run()
}