package com.fighter.cinematicket.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
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
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.White

@Composable
fun OutLinedChip(text: String) {
    Text(
        modifier = Modifier
            .padding(4.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .border(
                border = BorderStroke(1.dp, Gray),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 18.dp, vertical = 8.dp),
        text = text,
        fontSize = 14.sp,
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        color = White,
        textAlign = TextAlign.Center
    )
}