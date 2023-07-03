package com.fighter.cinematicket.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.Orange

@Composable
fun PrimaryButton(painter: Painter, text: String) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = Orange),
    ) {
        Icon(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
        Text(text = text, fontFamily = OpenSans, fontWeight = FontWeight.Medium)
    }
}