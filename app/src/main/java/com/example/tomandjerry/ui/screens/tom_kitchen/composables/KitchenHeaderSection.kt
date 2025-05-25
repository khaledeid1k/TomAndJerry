package com.example.tomandjerry.ui.screens.tom_kitchen.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer

@Composable
fun KitchenHeaderSection() {
    HeaderTomKitchenScreen(
        icon = R.drawable.ruler,
        title = "Tom's Kitchen"
    )
    VerticalSpacer(space = 16.dp)
    HeaderTomKitchenScreen(
        icon = R.drawable.chef,
        title = "Shocking foods"
    )
}