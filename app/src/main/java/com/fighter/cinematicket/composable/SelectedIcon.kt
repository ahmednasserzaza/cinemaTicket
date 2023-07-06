package com.fighter.cinematicket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.White

@Composable
fun SelectedIcon(painter: Painter, onClick: () -> Unit) {
    Icon(
        painter = painter,
        contentDescription = null,
        tint = White,
        modifier = Modifier
            .clip(shape = CircleShape)
            .clickable { onClick() }
            .background(Orange)
            .padding(12.dp)
    )
}