package ru.dyachkov.kotlinsecuritydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSecurityDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinSecurityDemoApplication>(*args)
}
