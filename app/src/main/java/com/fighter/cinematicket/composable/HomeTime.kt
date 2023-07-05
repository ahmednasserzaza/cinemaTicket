package com.fighter.cinematicket.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.LightBlack

@Composable
fun HomeTime(time:String , painter: Painter) {
    Row(
        modifier = Modifier
            .width(80.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            painter = painter,
            contentDescription = null,
            tint = LightBlack,
            modifier = Modifier.size(18.dp)
        )
        Text(text = time, fontSize = 12.sp, color = Black)
    }
}