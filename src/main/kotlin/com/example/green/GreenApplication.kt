package com.example.green

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GreenApplication

fun main(args: Array<String>) {
	runApplication<GreenApplication>(*args)
}
