package com.mskalski.iobenchmark

import kotlin.random.Random

object RandomFailure {
    fun throwErrorWithProbability(probability: Int = 25) {
        val randomInt = Random.nextInt(0, 100)
        if(randomInt < probability) {
            throw RuntimeException("Random error has been thrown")
        }
    }
}