package com.mskalski.iobenchmark

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController(private val resourceRepository: ResourceRepository) {

    @PostMapping("/resource/{id}")
    fun createResource(@PathVariable id: String, @RequestBody payload: Payload) {
        resourceRepository.store(id, payload.value)
    }

    @GetMapping("/resource/{id}")
    fun getResource(@PathVariable id: String): String? {
        return resourceRepository.load(id)
    }

    @DeleteMapping("/resource/{id}")
    fun deleteResource(@PathVariable id: String) {
        resourceRepository.delete(id)
    }
}

data class Payload(val value: String)