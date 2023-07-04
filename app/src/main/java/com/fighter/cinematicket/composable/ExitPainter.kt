package com.fighter.cinematicket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.ui.theme.LightWhite
import com.fighter.cinematicket.ui.theme.TransGray

@Composable
fun ExitPainter(primaryPainter: Painter, modifier: Modifier = Modifier) {
    Icon(
        painter = primaryPainter,
        contentDescription = null,
        tint = LightWhite,
        modifier = modifier
            .clip(shape = CircleShape)
            .background(TransGray)
            .padding(4.dp)
    )
}