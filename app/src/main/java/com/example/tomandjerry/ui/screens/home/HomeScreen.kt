package com.example.tomandjerry.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.ui.composables.TomItemsHeader
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.home.composables.BannerHomeScreen
import com.example.tomandjerry.ui.screens.home.composables.HeaderHomeScreen
import com.example.tomandjerry.ui.screens.home.composables.SearchHomeScreen
import com.example.tomandjerry.ui.screens.home.composables.tomItemsHomeScreen
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        contentPadding = PaddingValues(bottom = 12.dp),
        modifier = modifier
            .fillMaxSize()
            .background(color = AntiFlashWhite)
            .padding(horizontal = 16.dp)
    ) {
        item {
            HeaderHomeScreen()
            VerticalSpacer(space = 12.dp)
            SearchHomeScreen()
            VerticalSpacer(space = 24.dp)
            BannerHomeScreen()
            VerticalSpacer(space = 24.dp)
            TomItemsHeader(
                title = "Cheap tom section"
            )
        }
        tomItemsHomeScreen()
    }
}


@Preview(showSystemUi = true)
@PreviewScreenSizes
@Composable
fun HomePreview() {
    TomAndJerryTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            HomeScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}