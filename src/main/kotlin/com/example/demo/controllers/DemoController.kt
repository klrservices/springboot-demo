package com.example.demo.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @Value("\${demo.name}")
    val name:String? = "World"

    @RequestMapping("/test")
    fun test() = "Hello $name!!!!"
}
