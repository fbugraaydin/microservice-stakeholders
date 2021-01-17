package com.fbugraaydin.microservice.api.participant.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("participants")
class ParticipantController {

    @GetMapping
    fun participants():String = "Participant List"

    @GetMapping("/status")
    fun status():String = "Up"

}