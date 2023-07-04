package com.fighter.cinematicket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.LightWhite
import com.fighter.cinematicket.ui.theme.OpenSans

@Composable
fun SeatsGraphItem(text: String, color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(14.dp)
                .clip(shape = CircleShape)
                .background(color)
        )
        Text(
            text = text,
            color = LightWhite,
            fontWeight = FontWeight.Normal,
            fontFamily = OpenSans,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 8.dp)
        )
    }

}