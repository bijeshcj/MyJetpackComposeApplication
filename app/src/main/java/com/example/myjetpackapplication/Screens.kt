package com.example.myjetpackapplication

sealed class Screens(val route: String){
    object Home : Screens(route = "HomeScreen")
    object Details : Screens(route = "DetailScreen")
}