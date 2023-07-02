package com.fighter.cinematicket.features.booking

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class BookingViewModel : ViewModel() {

    private val _state = MutableStateFlow(BookingUiState())
    val state = _state.asStateFlow()


    init {
        getActors()
    }

    private fun getActors() {
        _state.update {
            it.copy(
                actorsImages = listOf(
                    "https://www.hollywoodreporter.com/wp-content/uploads/2022/05/GettyImages-1397927783-H-2022.jpg?w=1296",
                    "https://m.media-amazon.com/images/M/MV5BMjI0MTg3MzI0M15BMl5BanBnXkFtZTcwMzQyODU2Mw@@._V1_FMjpg_UX1000_.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-bt7_ZKFMU8UOOjlq-GYF5P0iNJVuqz9HuDI3GkLmLXDfifpy",
                    "https://www.gotceleb.com/wp-content/uploads/photos/talitha-bateman/geostorm-premiere-in-los-angeles/Talitha-Bateman%C2%A0--Geostorm-Premiere-in-Los-Angeles--06.jpg",
                    "https://nationaltoday.com/wp-content/uploads/2022/10/Denzel-Washington-1200x834.jpg",
                    "https://hips.hearstapps.com/hmg-prod/images/gettyimages-698930784.jpg",
                    "https://i.insider.com/612cd72112b9cc0019634875?width=700",
                    "https://www.indiewire.com/wp-content/uploads/2022/08/Brad-Pitt.jpg?w=3000&h=2000&crop=1",
                    "https://hips.hearstapps.com/hmg-prod/images/will-smith-attends-varietys-creative-impact-awards-and-10-directors-to-watch-brunch-at-the-parker-palm-springs-on-january-3-2016-in-palm-springs-california-photo-by-jerod-harrisgetty-images.jpg",
                    "https://images.hellomagazine.com/horizon/square/821036cf20cd-keanu-reeves.jpg"
                )
            )
        }
    }
}