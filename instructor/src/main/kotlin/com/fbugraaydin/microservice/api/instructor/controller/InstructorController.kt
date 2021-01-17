package com.fbugraaydin.microservice.api.instructor.controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("instructors")
class InstructorController {

    @GetMapping
    fun instructors():String = "Instructor List"

    @GetMapping("/status")
    fun status():String = "Up"

}