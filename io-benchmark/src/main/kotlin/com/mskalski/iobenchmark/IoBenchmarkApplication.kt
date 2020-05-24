package com.mskalski.iobenchmark

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IoBenchmarkApplication

fun main(args: Array<String>) {
    runApplication<IoBenchmarkApplication>(*args)
}
