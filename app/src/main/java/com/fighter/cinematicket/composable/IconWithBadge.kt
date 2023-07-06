package com.fighter.cinematicket.composable

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.fighter.cinematicket.ui.theme.Black
import com.fighter.cinematicket.ui.theme.Orange
import com.fighter.cinematicket.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IconWithBadge(counter:Int ,painter: Painter ){
    BadgedBox(badge = {
        Badge(containerColor = Orange, contentColor = White) { Text(counter.toString()) }
    }) {
        Icon(
            painter = painter,
            contentDescription = "search",
            tint = Black,
        )
    }
}