package com.fighter.cinematicket.features.tickets

data class TicketUiState(
    val dates: List<DateUiSate> = emptyList(),
    val times: List<String> = emptyList()
)

data class DateUiSate(
    val dayNumber: Int,
    val day: String
)