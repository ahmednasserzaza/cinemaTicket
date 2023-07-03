package com.fighter.cinematicket.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.OpenSans

@Composable
fun BookingFilter(text: String) {
    Box(
        modifier = Modifier
            .border(
                width = 0.2.dp,
                color = Gray,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(vertical = 4.dp, horizontal = 8.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontFamily = OpenSans,
            fontWeight = FontWeight.Normal,
            color = Black
        )
    }
}