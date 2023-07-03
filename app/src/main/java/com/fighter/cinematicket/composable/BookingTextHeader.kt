package com.fighter.cinematicket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.OpenSans

@Composable
fun TextBookingHeader(rate: String, textType: String, percentageRate: String = "") {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Text(
                text = rate,
                color = Black,
                fontFamily = OpenSans,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = percentageRate,
                color = Gray,
                fontFamily = OpenSans,
                fontWeight = FontWeight.Medium
            )
        }
        Text(
            text = textType,
            color = Gray,
            fontFamily = OpenSans,
            fontWeight = FontWeight.Medium
        )
    }
}