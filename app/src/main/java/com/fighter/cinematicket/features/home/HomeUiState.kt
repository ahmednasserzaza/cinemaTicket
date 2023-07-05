package com.fighter.cinematicket.features.home

data class HomeUiState(
    val images: List<String> = emptyList(),
    val currentImage: String = ""
)