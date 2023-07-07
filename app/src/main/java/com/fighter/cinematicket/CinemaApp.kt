package com.fighter.cinematicket

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.fighter.cinematicket.navigation.CinemaNavGraph

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaApp() {
    Scaffold {
        val navController = rememberNavController()
        CinemaNavGraph(navController = navController)
    }
}

@Preview
@Composable
fun PreviewFood() {
    CinemaApp()
}