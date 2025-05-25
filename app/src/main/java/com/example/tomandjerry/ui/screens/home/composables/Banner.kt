package com.example.tomandjerry.ui.screens.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.AteneoBlue
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun BannerHomeScreen(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent, RoundedCornerShape(16.dp))
        ) {

            Box(
                modifier = Modifier

                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .background(AteneoBlue, RoundedCornerShape(16.dp))
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = ibmPlexSans
                    )
                    VerticalSpacer(space = 8.dp)
                    Text(
                        "Adopt Tom! (Free Fail-Free \nGuarantee)",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = ibmPlexSans
                    )
                }
            }
            Image(
                modifier = Modifier
                    .clip(RoundedCornerShape(bottomEnd = 30.dp))
                    .offset(y = (-11).dp, x = (40).dp)
                    .align(Alignment.TopEnd)
                    .size(width = 155.dp, height = 130.dp),
                painter = painterResource(id = R.drawable.cat_banner),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopStart,

                )
        }
    }
}