package com.demo.kotlin.boot

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoResource {

    @GetMapping("/demo")
    fun demo() : ResponseEntity<String>{
        return ResponseEntity("Hello Kotlin!", HttpStatus.OK)
    }
}