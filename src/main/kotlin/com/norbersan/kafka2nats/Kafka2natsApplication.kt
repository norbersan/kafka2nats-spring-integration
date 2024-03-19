package com.norbersan.kafka2nats

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Kafka2natsApplication

fun main(args: Array<String>) {
    runApplication<Kafka2natsApplication>(*args)
}
