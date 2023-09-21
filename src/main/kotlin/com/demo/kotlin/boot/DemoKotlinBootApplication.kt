package com.demo.kotlin.boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoKotlinBootApplication

fun main(args: Array<String>) {
	runApplication<DemoKotlinBootApplication>(*args)
}
