package com.example.tomandjerry

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tomandjerry.ui.screens.home.HomeScreen
import com.example.tomandjerry.ui.screens.tom_kitchen.TomKitchenScreen
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomAndJerryApp(modifier: Modifier = Modifier) {
    TomAndJerryTheme {
        Scaffold(
            topBar = {},
            modifier = Modifier.fillMaxSize()) { innerPadding ->

            TomKitchenScreen(modifier = modifier.padding(innerPadding))

        }
    }
}