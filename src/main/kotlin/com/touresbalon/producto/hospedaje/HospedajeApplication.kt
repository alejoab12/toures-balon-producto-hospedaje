package com.touresbalon.producto.hospedaje

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
class HospedajeApplication

fun main(args: Array<String>) {
    runApplication<HospedajeApplication>(*args)
}