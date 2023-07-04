package com.fighter.cinematicket.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.features.tickets.DateUiSate
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.LightBlack
import com.fighter.cinematicket.ui.theme.OpenSans
import com.fighter.cinematicket.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemDate(date: DateUiSate, onClick: (DateUiSate) -> Unit) {
    Card(
        modifier = Modifier
            .size(width = 60.dp, height = 70.dp),
        colors = CardDefaults.cardColors(containerColor = White),
        border = BorderStroke(0.2.dp, color = Gray),
        shape = RoundedCornerShape(16.dp),
        onClick = { onClick(date) }

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = date.dayNumber.toString(),
                fontSize = 20.sp,
                fontFamily = OpenSans,
                color = Black,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = date.day,
                fontSize = 16.sp,
                fontFamily = OpenSans,
                color = LightBlack,
                fontWeight = FontWeight.Normal
            )
        }

    }
}

@Preview
@Composable
fun PreviewDate() {
//    ItemDate(DateUiSate(12, "Friday" , {()}))
}