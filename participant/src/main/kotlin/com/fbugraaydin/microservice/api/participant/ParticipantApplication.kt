package com.fbugraaydin.microservice.api.participant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ParticipantApplication

fun main(args: Array<String>) {
    runApplication<ParticipantApplication>(*args)
}
