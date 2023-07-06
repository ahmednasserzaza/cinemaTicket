package com.fighter.cinematicket.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.fighter.cinematicket.screens.home.HomeScreen

private const val ROUTE = "homeScreen"

fun NavGraphBuilder.homeRoute(navController: NavHostController) {
    composable(ROUTE) { HomeScreen(navController) }
}