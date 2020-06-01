package com.mskalski.iobenchmark

import org.springframework.stereotype.Repository

@Repository
class ResourceRepository {

    var storage = mutableMapOf<String, String>()

    fun store(id: String, value: String) {
        storage[id] = value
    }

    fun load(id: String): String? {
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