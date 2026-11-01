package io.github.theunderseer.compactcalendar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform