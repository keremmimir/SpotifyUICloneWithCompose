package com.example.spotifyuiclonewithcompose.uix

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(startPage : String) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = startPage){
        composable("homePage"){
            HomePage(navHostController)
        }
        composable("searchPage"){
            SettingPage(navHostController)
        }
        composable("libaryPage"){
            LibaryPage(navHostController)
        }
    }
}