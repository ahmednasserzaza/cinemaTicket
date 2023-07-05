package com.fighter.cinematicket.bottomNavigation

import com.fighter.cinematicket.R

sealed class BottomBarScreen(val route: String, val icon: Int) {
    object Home : BottomBarScreen(route = "home", icon = R.drawable.icon_movie)
    object Booking : BottomBarScreen(route = "booking", icon = R.drawable.icon_bocking)
    object Tickets : BottomBarScreen(route = "tickets", icon = R.drawable.icon_ticket)
}
