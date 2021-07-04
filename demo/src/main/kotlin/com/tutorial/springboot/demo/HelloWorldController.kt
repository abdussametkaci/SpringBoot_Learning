package com.tutorial.springboot.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {
    //@GetMapping("springboot") // "/api/hello/springboot" -> append the path
    @GetMapping // use root path
    fun helloWorld(): String = "Hello, this is a REST endpoint!"
}