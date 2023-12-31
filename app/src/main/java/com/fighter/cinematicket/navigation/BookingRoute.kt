package com.fighter.cinematicket.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.fighter.cinematicket.screens.booking.BookingScreen

private const val ROUTE = "bookingScreen"

fun NavGraphBuilder.bookingRoute(navController: NavHostController) {
    composable(ROUTE) { BookingScreen(navController) }
}