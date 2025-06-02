package com.example.tomandjerry.ui.screens.TomKitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.TomKitchen.composables.AddToCartButton
import com.example.tomandjerry.ui.screens.TomKitchen.composables.DetailsSection
import com.example.tomandjerry.ui.screens.TomKitchen.composables.DishInfo
import com.example.tomandjerry.ui.screens.TomKitchen.composables.KitchenHeaderSection
import com.example.tomandjerry.ui.screens.TomKitchen.composables.preparationSteps
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.SemiTransparentBlue
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun TomKitchenScreen(modifier: Modifier) {
    Box(
        modifier
            .fillMaxSize()
            .background(SemiTransparentBlue)
        ) {
        Image(
            alignment = Alignment.TopStart,
            painter = painterResource(id = R.drawable.ellipse_3),
            contentDescription = null
        )
        Column {
            Box(
                modifier = Modifier.weight(1f)
            ) {
                KitchenHeaderSection(modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxSize()
            ) {
                    LazyColumn(
                        contentPadding = PaddingValues(bottom = 88.dp),
                        modifier = Modifier
                            .background(
                                AntiFlashWhite,
                                RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp)
                            )
                            .fillMaxSize()
                            .padding(top = 32.dp)
                            .padding(horizontal = 16.dp)

                    ) {
                        item {
                            DishInfo()
                            VerticalSpacer(space = 24.dp)
                            DetailsSection()
                        }
                        preparationSteps()

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

        AddToCartButton(modifier = Modifier.align(Alignment.BottomCenter))

    }

}

@Preview(showSystemUi = true)
@PreviewScreenSizes
@Composable
fun TomKitchenScreenPreview() {
    TomAndJerryTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            TomKitchenScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}