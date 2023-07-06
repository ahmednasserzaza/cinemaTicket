package com.fighter.cinematicket.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.fighter.cinematicket.screens.booking.ActorUiState

@Composable
fun ActorItem(state: ActorUiState) {
    Image(
        painter = rememberAsyncImagePainter(state.imageUrl),
        contentDescription = "actor image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(68.dp)
            .padding(4.dp)
            .clip(shape = CircleShape),
    )
}

@Preview
@Composable
fun prevActor() {
    ActorItem(state = ActorUiState())
}