package com.example.spotifyuiclonewithcompose.uix

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spotifyuiclonewithcompose.ui.theme.BackgroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibaryPage(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Libary", color = Color.White) },
            colors = TopAppBarDefaults.topAppBarColors(
                BackgroundColor
            ),
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(color = BackgroundColor),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("LibaryPage", color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        }
    }
}