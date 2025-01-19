package com.example.spotifyuiclonewithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.spotifyuiclonewithcompose.ui.theme.SpotifyUICloneWithComposeTheme
import com.example.spotifyuiclonewithcompose.uix.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifyUICloneWithComposeTheme {
                AppNavigation()
            }
        }
    }
}
