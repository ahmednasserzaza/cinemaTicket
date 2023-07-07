package com.fighter.cinematicket.screens.home

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import kotlin.math.absoluteValue

@ExperimentalPagerApi
@Composable
fun AutoSliding(
    moviesImages: List<String>,
    pagerState: PagerState,
    onUpdateMovieImage: (String) -> Unit
) {

    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            count = moviesImages.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 48.dp),
        ) { page ->

            val currentImageUrl = moviesImages[page]
            val pageOffset = (pagerState.currentPage - page).absoluteValue
            val scale by animateFloatAsState(
                targetValue = 0.85f + 0.15f * (1f - pageOffset.coerceIn(0, 1)),
                animationSpec = tween(durationMillis = 500)
            )
            val alpha by animateFloatAsState(
                targetValue = 0.8f + 0.8f * (1f - pageOffset.coerceIn(0, 1)),
                animationSpec = tween(durationMillis = 500)
            )

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
            onUpdateMovieImage(moviesImages[pagerState.currentPage])
        }
    }
}
