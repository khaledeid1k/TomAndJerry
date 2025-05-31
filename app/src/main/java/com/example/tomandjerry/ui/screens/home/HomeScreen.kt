package com.example.tomandjerry.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.home.composables.BannerHomeScreen
import com.example.tomandjerry.ui.screens.home.composables.HeaderHomeScreen
import com.example.tomandjerry.ui.screens.home.composables.SearchHomeScreen
import com.example.tomandjerry.ui.screens.home.composables.TomItemsHeader
import com.example.tomandjerry.ui.screens.home.composables.tomItemsHomeScreen
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = AntiFlashWhite)
            .padding(horizontal = 16.dp)
            .padding(bottom = 12.dp)
    ) {
        item {
            HeaderHomeScreen()
            VerticalSpacer(space = 12.dp)
            SearchHomeScreen()
            VerticalSpacer(space = 24.dp)
            BannerHomeScreen()
            VerticalSpacer(space = 24.dp)
            TomItemsHeader()
        }
        tomItemsHomeScreen()
    }
}


@Preview
@Composable
fun HomePreview() {
    TomAndJerryTheme {
        HomeScreen(
            modifier = Modifier.padding(
                top = 48.dp
            )
        )
    }
}