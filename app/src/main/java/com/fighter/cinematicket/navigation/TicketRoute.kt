package com.fighter.cinematicket.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.fighter.cinematicket.features.tickets.TicketScreen

private const val ROUTE = "ticketScreen"

fun NavGraphBuilder.ticketRoute(navController: NavHostController) {
    composable(ROUTE) { TicketScreen(navController) }
}