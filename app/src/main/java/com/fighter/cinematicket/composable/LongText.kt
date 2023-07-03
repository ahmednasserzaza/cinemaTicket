package com.fighter.cinematicket.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.OpenSans

@Composable
fun LongText(text:String) {
    Text(
        text = text,
        fontSize = 12.sp,
        fontFamily = OpenSans,
        color = Black,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(16.dp)
    )
}