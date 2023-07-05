package com.fighter.cinematicket.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.White

@Composable
fun FilledChip(text: String) {
    Text(
        modifier = Modifier
            .padding(4.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(Orange)
            .padding(horizontal = 18.dp, vertical = 8.dp),
        text = text,
        fontSize = 14.sp,
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        color = White,
        textAlign = TextAlign.Center
    )
}