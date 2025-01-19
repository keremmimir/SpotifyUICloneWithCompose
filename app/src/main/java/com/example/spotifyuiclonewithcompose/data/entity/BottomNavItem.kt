package com.example.spotifyuiclonewithcompose.data.entity

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : BottomNavItem("home", "Home", Icons.Default.Home)
    data object Settings : BottomNavItem("settings", "Settings", Icons.Default.Settings)
    data object Libary : BottomNavItem("libary", "Libary", Icons.Default.Menu)
}