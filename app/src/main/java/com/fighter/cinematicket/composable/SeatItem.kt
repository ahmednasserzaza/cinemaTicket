package com.fighter.cinematicket.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fighter.cinematicket.R
import com.fighter.cinematicket.ui.theme.Gray
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.White

@Composable
fun SeatItem(tintLeft: Color, tintRight: Color, rotateDeg: Float = 0f) {
    Row(
        modifier = Modifier
            .rotate(rotateDeg)
            .border(
                border = BorderStroke(1.dp, Gray),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.icon_seat),
            contentDescription = null,
            tint = tintLeft,
        )
        Icon(
            painter = painterResource(id = R.drawable.icon_seat),
            contentDescription = null,
            tint = tintRight,
        )
    }
}

@Preview
@Composable
fun PreviewSeatItem() {
    SeatItem(White, Orange)
}