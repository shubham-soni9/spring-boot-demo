package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @RequestMapping("/health")
    fun health(): String {
        return "Hello Shubham. You are live now..."
    }
}
