package com.fighter.cinematicket.screens.booking

data class BookingUiState(
    val posterImage: String = "",
    val actorsImages: List<ActorUiState> = emptyList()
)

data class ActorUiState(
    val imageUrl: String = ""
)
