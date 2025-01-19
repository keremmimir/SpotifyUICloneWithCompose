package com.example.spotifyuiclonewithcompose.uix

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.spotifyuiclonewithcompose.data.entity.BottomNavItem

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomNavigationBar(navController)
    }) { paddingValues ->
        NavHost(
            navController,
            startDestination = BottomNavItem.Home.route,
            Modifier.padding(0.dp)
        ) {
            composable(BottomNavItem.Home.route) {
                HomePage()
            }
            composable(BottomNavItem.Settings.route) {
                SettingPage()
            }
            composable(BottomNavItem.Libary.route) {
                LibaryPage()
            }
        }
    }
}