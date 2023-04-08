package com.example.myjetpackapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myjetpackapplication.ui.screens.DetailsScreen
import com.example.myjetpackapplication.ui.screens.HomeScreen

@Composable
fun SetUpNavGraph(navController: NavHostController,
startDestination: String= "HomeScreen"){
    NavHost(navController = navController, 
        startDestination = Screens.Home.route){
        composable(route = Screens.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screens.Details.route){
            DetailsScreen(navController = navController)
        }
    }
}