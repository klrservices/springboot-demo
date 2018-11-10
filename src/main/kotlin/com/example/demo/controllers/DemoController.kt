package com.example.demo.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @Value("\${demo.name}")
    val name:String? = "World"

    @Value("\${demo.greeting}")
    val greeting:String? = "Hello"

    @Value("\${demo.greeter}")
    val greeter:String? = "Spring"

    @RequestMapping("/test")
    fun test() = "$greeting $name from $greeter !!!!"
}
