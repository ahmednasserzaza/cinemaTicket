package com.fighter.cinematicket.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fighter.cinematicket.features.booking.BookingScreen
import com.fighter.cinematicket.features.home.HomeScreen
import com.fighter.cinematicket.features.tickets.TicketScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Booking.route) {
            BookingScreen()
        }
        composable(route = BottomBarScreen.Tickets.route) {
            TicketScreen()
        }
    }
}