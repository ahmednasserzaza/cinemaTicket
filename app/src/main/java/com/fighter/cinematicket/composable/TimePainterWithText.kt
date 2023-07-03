package com.fighter.cinematicket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.LightWhite
import com.fighter.cinematicket.ui.theme.TransGray

@Composable
fun TimePainterWithText(secondaryPainter: Painter, secondaryPainterText: String) {
    Row(
        modifier = Modifier
            .width(80.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(TransGray)
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Icon(
            painter = secondaryPainter,
            contentDescription = null,
            tint = LightWhite,
            modifier = Modifier.size(18.dp)
        )
        Text(text = secondaryPainterText, fontSize = 12.sp, color = LightWhite)
    }
}