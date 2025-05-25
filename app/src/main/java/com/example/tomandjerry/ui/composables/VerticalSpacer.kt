package com.example.tomandjerry.ui.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun VerticalSpacer(modifier: Modifier = Modifier, space: Dp = 0.dp) {
    Spacer(modifier = modifier.height(space))
}