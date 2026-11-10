package com.example

import io.ktor.server.application.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.response.*

fun Application.configureHttp() {
    install(Compression)
}
