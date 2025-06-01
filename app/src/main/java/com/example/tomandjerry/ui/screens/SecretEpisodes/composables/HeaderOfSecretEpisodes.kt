package com.example.tomandjerry.ui.screens.SecretEpisodes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BlueCola

@Composable
fun HeaderOfSecretEpisodes(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(
                    shape = RoundedCornerShape(12.dp)
                )
                .size(width = 40.dp, height = 40.dp),
            painter = painterResource(id = R.drawable.tom_and_jerry),
            contentDescription = null
        )
        Column(
            modifier = Modifier
                .background(color = BlueCola, shape = RoundedCornerShape(12.dp))
        ) {
            Image(
                modifier = Modifier.padding(8.dp),
                painter = painterResource(id = R.drawable.explor),
                contentDescription = null
            )
        }


    }
}