package com.fighter.cinematicket.features.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getMovies()
    }

    fun updateCurrentImage(currentImage: String) {
       _state.update {
            it.copy(currentImage = currentImage)
        }
    }

    private fun getMovies() {
        _state.update {
            it.copy(
                images = listOf(
                    "https://www.hollywoodreporter.com/wp-content/uploads/2022/05/GettyImages-1397927783-H-2022.jpg?w=1296",
                    "https://m.media-amazon.com/images/M/MV5BMjI0MTg3MzI0M15BMl5BanBnXkFtZTcwMzQyODU2Mw@@._V1_FMjpg_UX1000_.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-bt7_ZKFMU8UOOjlq-GYF5P0iNJVuqz9HuDI3GkLmLXDfifpy",
                    "https://nationaltoday.com/wp-content/uploads/2022/10/Denzel-Washington-1200x834.jpg",
                )
            )
        }
    }

}