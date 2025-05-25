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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.AddToCartButton
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.DetailsSection
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.DishInfo
import com.example.tomandjerry.ui.screens.tom_kitchen.composables.KitchenHeaderSection
import com.example.tomandjerry.ui.theme.AntiFlashWhite
import com.example.tomandjerry.ui.theme.SemiTransparentBlue
import com.example.tomandjerry.ui.theme.TomAndJerryTheme
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun TomKitchenScreen(modifier: Modifier = Modifier) {
    Box {
        Column(
            modifier = modifier
                .align(Alignment.TopCenter)
                .fillMaxSize()
                //todo make background mix
                .background(SemiTransparentBlue)
                .padding(top = 48.dp)

        ) {

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 58.dp)

            ) {
                KitchenHeaderSection()
            }
            Card(
                shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp),
                modifier = Modifier

                    .fillMaxSize()

            ) {
                Column(
                    modifier = Modifier
                        .background(AntiFlashWhite)
                        .fillMaxSize()
                        .padding(horizontal = 16.dp)
                        .padding(top = 32.dp, bottom = 15.dp)
                ) {
                    DishInfo()

                    Text(
                        "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = ibmPlexSans,
                        color = darkOverlay,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    VerticalSpacer(space = 24.dp)
                    DetailsSection()


                }

            }

        }
        Image(
            painter = painterResource(id = R.drawable.salsa),
            contentDescription = null,
            modifier = Modifier
                .align(
                    Alignment.TopEnd
                )
                .offset(
                    y = 45.dp
                )
                .width(200.dp)
                .height(180.dp)
        )
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