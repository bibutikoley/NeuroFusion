package io.bibuti.neurofusion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform