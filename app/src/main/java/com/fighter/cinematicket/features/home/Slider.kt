package com.fighter.cinematicket.features.home

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.delay
import java.lang.Thread.yield
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalPagerApi
@Composable
fun AutoSliding(moviesImages: List<String>, updateCurrentImage: (String) -> Unit) {
    val pagerState = rememberPagerState(initialPage = moviesImages.size / 2)

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(2000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (moviesImages.size),
                animationSpec = tween(800)
            )
        }
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {
        HorizontalPager(
            pageCount = moviesImages.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 48.dp),
        ) { page ->

            val currentImageUrl = moviesImages[page]
            updateCurrentImage(currentImageUrl)

            val pageOffset = (pagerState.currentPage - page).absoluteValue

            val scale = 0.85f + 0.15f * (1f - pageOffset.coerceIn(0, 1))
            val alpha = 0.8f + 0.8f * (1f - pageOffset.coerceIn(0, 1))

            Card(
                modifier = Modifier
                    .graphicsLayer {
                        scaleX = scale
                        scaleY = scale
                        this.alpha = alpha
                    },
                shape = RoundedCornerShape(24.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(model = currentImageUrl),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }

}