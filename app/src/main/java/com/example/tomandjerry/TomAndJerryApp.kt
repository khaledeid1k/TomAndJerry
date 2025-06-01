package com.example.tomandjerry

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tomandjerry.ui.screens.SecretEpisodes.SecretEpisodesScreen
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomAndJerryApp(modifier: Modifier = Modifier) {
    TomAndJerryTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            // HomeScreen(modifier = modifier.padding(innerPadding))
            //  TomKitchenScreen(modifier = modifier.padding(innerPadding))
            // AccountScreen(modifier = modifier.padding(innerPadding))
            SecretEpisodesScreen(modifier = modifier.padding(innerPadding))


        }
    }
}