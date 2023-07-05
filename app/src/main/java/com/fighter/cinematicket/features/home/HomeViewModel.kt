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
                    "https://creativereview.imgix.net/content/uploads/2019/12/joker_full.jpg?auto=compress,format&q=60&w=1012&h=1500",
                    "https://images.savoysystems.co.uk/PCH/9640676.jpg",
                    "https://i.pinimg.com/originals/02/87/61/02876144fce74bd2a5f434c60f031989.jpg",
                    "https://img.fruugo.com/product/0/61/17222610_max.jpg",
                    "https://www.boredpanda.com/blog/wp-content/uploads/2022/05/best-thriller-movies-53-628c95ea5bf80__700.jpg",
                    "https://cdnb.artstation.com/p/assets/images/images/011/694/837/large/editician-zone-editician-zone-113.jpg?1530897875",
                    "https://cdn.shopify.com/s/files/1/0057/3728/3618/products/108b520c55e3c9760f77a06110d6a73b_240x360_crop_center.progressive.jpg?v=1573652543",
                    "https://images.fandango.com/ImageRenderer/0/0/redesign/static/img/default_poster.png/0/images/masterrepository/other/ant_man_ver5.jpg",
                    "https://themarketingbirds.com/wp-content/uploads/2021/04/unnamed-1.jpg",
                    "https://d1csarkz8obe9u.cloudfront.net/posterpreviews/action-movie-poster-template-design-0f5fff6262fdefb855e3a9a3f0fdd361_screen.jpg?ts=1636996054"

                )
            )
        }
    }

}