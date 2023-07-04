package com.fighter.cinematicket.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.OpenSans

@Composable
fun LargeMovieName(text: String , modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontFamily = OpenSans,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        modifier = modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}