package com.mskalski.iobenchmark

import org.springframework.stereotype.Repository

@Repository
class ResourceRepository {

    var storage = mutableMapOf<String, String>()

    fun store(id: String, value: String) {
        RandomFailure.throwErrorWithProbability()
        storage[id] = value
    }

    fun load(id: String): String? {
        RandomFailure.throwErrorWithProbability(35)
        return if (id in storage) {
            storage[id]
        } else {
            null
        }
    }

    fun delete(id: String) {
        storage.remove(id)
    }
}