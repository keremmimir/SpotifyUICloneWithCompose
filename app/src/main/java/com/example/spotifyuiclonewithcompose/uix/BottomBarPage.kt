package com.example.spotifyuiclonewithcompose.uix

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.spotifyuiclonewithcompose.R
import com.example.spotifyuiclonewithcompose.ui.theme.BottomBarColor

@Composable
fun BottomBarPage() {
    val selectedItem = remember { mutableStateOf(0) }
    Scaffold(bottomBar = {
        BottomAppBar(contentColor = Color.Gray,
            containerColor = BottomBarColor,
            content = {
                NavigationBarItem(
                    selected = selectedItem.value == 0,
                    onClick = { selectedItem.value = 0 },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.baseline_home_24),
                            contentDescription = "",
                        )
                    }, label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.White,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = selectedItem.value == 1,
                    onClick = { selectedItem.value = 1 },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.baseline_search_24),
                            contentDescription = "",
                        )
                    }, label = { Text("Search") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.White,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = selectedItem.value == 2,
                    onClick = { selectedItem.value = 2 },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.baseline_library_music_24),
                            contentDescription = "",
                        )
                    }, label = { Text("Libary") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.White,
                        unselectedTextColor = Color.Gray,
                        indicatorColor = Color.Transparent
                    )
                )
            })
    }) { paddingValues ->
        Column(
            Modifier
                .fillMaxWidth()
                .padding(0.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (selectedItem.value == 0) Navigation("homePage")
            if (selectedItem.value == 1) Navigation("searchPage")
            if (selectedItem.value == 2) Navigation("libaryPage")
        }
    }
}