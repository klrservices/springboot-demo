package com.example.demo

import com.example.demo.controllers.DemoController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication

@Bean
fun controller() = DemoController()

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
