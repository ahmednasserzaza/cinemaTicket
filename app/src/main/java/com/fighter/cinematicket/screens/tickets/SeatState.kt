package com.fighter.cinematicket.screens.tickets

import androidx.compose.ui.graphics.Color
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.Orange

sealed class SeatState(val seatColor: Color) {
    object Available : SeatState(Color.White)
    object Taken : SeatState(Gray)
    object Selected : SeatState(Orange)

    fun nextState(): SeatState {
        return when (this) {
            Available -> Selected
            Selected -> Taken
            Taken -> Available
        }
    }
}