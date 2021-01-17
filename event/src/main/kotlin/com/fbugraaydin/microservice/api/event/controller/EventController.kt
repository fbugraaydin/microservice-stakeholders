package com.fbugraaydin.microservice.api.event.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("events")
class EventController {

    @GetMapping
    fun events():String = "Event List"

    @GetMapping("/status")
    fun status():String = "Up"

}