package com.example.tomandjerry.ui.screens.SecretEpisodes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.ui.composables.TitleOfScreen
import com.example.tomandjerry.ui.composables.TomItemsHeader
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.SecretEpisodes.composables.HeaderOfSecretEpisodes
import com.example.tomandjerry.ui.screens.SecretEpisodes.composables.InfoSecretEpisodes
import com.example.tomandjerry.ui.screens.SecretEpisodes.composables.PopularCharacters
import com.example.tomandjerry.ui.screens.SecretEpisodes.composables.TomsMostWatched
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import com.example.tomandjerry.ui.theme.WinterWizard

@Composable
fun SecretEpisodesScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(WinterWizard, Color.White),
                    start = Offset(0f, 0f),
                    end = Offset(0f, Float.POSITIVE_INFINITY)
                )
            )
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp)

    ) {
        HeaderOfSecretEpisodes()
        InfoSecretEpisodes(modifier.align(Alignment.Start))
        TomItemsHeader(title = "Most watched")
        TomsMostWatched(modifier = Modifier.padding(top = 12.dp))
        VerticalSpacer(space = 24.dp)
        TitleOfScreen(title = "Popular character")
        VerticalSpacer(space = 12.dp)
        PopularCharacters(modifier = Modifier.padding(top = 12.dp))
        VerticalSpacer(space = 84.dp)


    }

}

@PreviewScreenSizes
@Composable
fun SecretEpisodesPreview() {
    TomAndJerryTheme {
        SecretEpisodesScreen(
            modifier = Modifier.padding(top = 48.dp)
        )

    }
}