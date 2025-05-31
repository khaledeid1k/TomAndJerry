package com.example.tomandjerry.ui.screens.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.AddToCartButton
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.DetailsSection
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.DishInfo
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.KitchenHeaderSection
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.preparationSteps
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.SemiTransparentBlue
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomKitchenScreen(modifier: Modifier = Modifier) {
    Box {
        Column(
            modifier = modifier
                .align(Alignment.TopCenter)
                .fillMaxSize()
                .background(SemiTransparentBlue)
                .padding(top = 48.dp)

        ) {
            KitchenHeaderSection(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .weight(4f)
            ) {
                Card(
                    shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp),
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    LazyColumn(
                        modifier = Modifier
                            .background(AntiFlashWhite)
                            .fillMaxSize()
                            .padding(horizontal = 16.dp)
                            .padding(top = 32.dp, bottom = 88.dp)
                    ) {
                        item {
                            DishInfo()
                            VerticalSpacer(space = 24.dp)
                            DetailsSection()
                        }
                        preparationSteps()
                    }

                }

                Image(
                    painter = painterResource(id = R.drawable.salsa),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(x = (-10).dp, y = (-150).dp)
                        .width(200.dp)
                        .height(180.dp)
                )
            }
        }

        AddToCartButton(modifier.align(Alignment.BottomCenter))

    }

}

@Preview
@Composable
fun TomKitchenScreenPreview(modifier: Modifier = Modifier) {
    TomAndJerryTheme {
        TomKitchenScreen()
    }
}