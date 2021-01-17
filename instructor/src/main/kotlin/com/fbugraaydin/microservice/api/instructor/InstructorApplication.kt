package com.fbugraaydin.microservice.api.instructor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class InstructorApplication

fun main(args: Array<String>) {
    runApplication<InstructorApplication>(*args)
}
