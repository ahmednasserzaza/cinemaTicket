package com.fighter.cinematicket.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.ui.theme.Black

@Composable
fun CinemaScreen(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(bottom = 16.dp)
            .drawWithContent {
                val gradient = Brush.linearGradient(
                    colors = listOf(Color.Transparent, Black),
                    start = Offset(0f, 0f),
                    end = Offset(0f, size.height)
                )
                drawContent()
                drawRect(brush = gradient)
            }
    )
}