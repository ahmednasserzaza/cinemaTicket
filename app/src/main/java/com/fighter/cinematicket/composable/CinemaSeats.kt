package com.fighter.cinematicket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.White

@Composable
fun CinemaSeats() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SeatItem(tintLeft = White, tintRight = Gray, 5f)
            SeatItem(tintLeft = Gray, tintRight = White, 5f)
            SeatItem(tintLeft = Orange, tintRight = Gray, 5f)
            SeatItem(tintLeft = Gray, tintRight = White, 5f)
            SeatItem(tintLeft = White, tintRight = Orange, 5f)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(top = 8.dp)
        ) {
            SeatItem(tintLeft = White, tintRight = White)
            SeatItem(tintLeft = White, tintRight = Gray)
            SeatItem(tintLeft = Orange, tintRight = Orange)
            SeatItem(tintLeft = White, tintRight = White)
            SeatItem(tintLeft = White, tintRight = Gray)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SeatItem(tintLeft = Gray, tintRight = White, -5f)
            SeatItem(tintLeft = Orange, tintRight = White, -5f)
            SeatItem(tintLeft = White, tintRight = Gray, -5f)
            SeatItem(tintLeft = White, tintRight = Orange, -5f)
            SeatItem(tintLeft = White, tintRight = White, -5f)
        }
    }

}

@Preview(widthDp = 360)
@Composable
fun PreviewSeats() {
    CinemaSeats()
}