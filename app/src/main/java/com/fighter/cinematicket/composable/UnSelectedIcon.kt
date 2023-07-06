package com.fighter.cinematicket.composable

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.fighter.cinematicket.ui.theme.Black

@Composable
fun UnSelectedIcon(painter: Painter){
    Icon(
        painter = painter,
        contentDescription = "",
        tint = Black,
    )
}