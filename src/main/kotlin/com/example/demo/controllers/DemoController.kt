package com.example.demo.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @RequestMapping("/test")
    fun test() = "Hello Warsaw Hackaton!!!!"
}
