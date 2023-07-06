package com.fighter.cinematicket.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun CinemaNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "homeScreen") {
        homeRoute(navController)
        bookingRoute(navController)
        ticketRoute(navController)
    }
}