package com.fighter.cinematicket.composable

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.R
import com.fighter.cinematicket.screens.tickets.SeatState
import com.fighter.cinematicket.ui.theme.Gray

@Composable
fun SeatItem(
    rotateDeg: Float = 0f,
    seatState: Pair<SeatState, SeatState> = Pair(SeatState.Available, SeatState.Available),
) {

    var leftSeatState by remember { mutableStateOf(seatState.first) }
    var rightSeatState by remember { mutableStateOf(seatState.second) }

    val leftSeatColor by animateColorAsState(getSeatColor(leftSeatState))
    val rightSeatColor by animateColorAsState(getSeatColor(rightSeatState))

    Box(
        modifier = Modifier.rotate(rotateDeg),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.icon_seat_container),
            contentDescription = "container",
            tint = Gray
        )
        Row(
            Modifier.padding(bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(
                modifier = Modifier.clickable { leftSeatState = leftSeatState.nextState() },
                painter = painterResource(id = R.drawable.final_seat_icon),
                contentDescription = "Seat",
                tint = leftSeatColor
            )
            Icon(
                modifier = Modifier.clickable { rightSeatState = rightSeatState.nextState() },
                painter = painterResource(id = R.drawable.final_seat_icon),
                contentDescription = "Seat",
                tint = rightSeatColor
            )
        }
    }
}


private fun getSeatColor(seat: SeatState): Color {
    return when (seat) {
        SeatState.Available -> SeatState.Available.seatColor
        SeatState.Taken -> SeatState.Taken.seatColor
        SeatState.Selected -> SeatState.Selected.seatColor
    }
}


@Preview
@Composable
fun PreviewSeatItem() {
//    SeatItem(1, 1, 1, onClickLeftSeat = {}, onClickRightSeat = {})
}