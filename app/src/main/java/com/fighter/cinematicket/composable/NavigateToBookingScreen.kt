package com.fighter.cinematicket.composable

import androidx.navigation.NavHostController
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally

fun navigateToHomeScreen(navHostController: NavHostController) {
    navHostController.navigate("homeScreen") {
        slideInHorizontally(initialOffsetX = { it })
        slideOutHorizontally(targetOffsetX = { -it })
        slideInHorizontally(initialOffsetX = { -it })
        slideOutHorizontally(targetOffsetX = { it })
    }

}

fun navigateToBookingScreen(navHostController: NavHostController) {
    navHostController.navigate("bookingScreen"){
        slideInHorizontally(initialOffsetX = { it })
        slideOutHorizontally(targetOffsetX = { -it })
        slideInHorizontally(initialOffsetX = { -it })
        slideOutHorizontally(targetOffsetX = { it })
    }
}

fun navigateToTicketScreen(navHostController: NavHostController) {
    navHostController.navigate("ticketScreen"){
        slideInHorizontally(initialOffsetX = { it })
        slideOutHorizontally(targetOffsetX = { -it })
        slideInHorizontally(initialOffsetX = { -it })
        slideOutHorizontally(targetOffsetX = { it })
    }
}

