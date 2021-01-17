package com.fbugraaydin.microservice.api.event

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class EventApplication

fun main(args: Array<String>) {
    runApplication<EventApplication>(*args)
}
