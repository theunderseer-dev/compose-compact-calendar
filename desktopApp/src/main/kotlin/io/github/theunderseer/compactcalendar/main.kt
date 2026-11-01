package io.github.theunderseer.compactcalendar

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeCompactCalendar",
    ) {
        App()
    }
}