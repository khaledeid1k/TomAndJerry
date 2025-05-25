package com.example.tomandjerry.ui.screens.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
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
import com.example.tomandjerry.ui.composables.HorizontalSpacer
import com.example.tomandjerry.ui.theme.DarkCerulean
import com.example.tomandjerry.ui.theme.EerieBlack
import com.example.tomandjerry.ui.theme.LightGray
import com.example.tomandjerry.ui.theme.QuickSilver
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun HeaderHomeScreen(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(top = 4.dp)
            .fillMaxWidth()
    ) {
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))

                .size(48.dp),
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = null
        )
        HorizontalSpacer(space = 8.dp)
        Column {
            Text(
                text = "Hi, Jerry 👋",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = ibmPlexSans,
                color = EerieBlack
            )
            Text(
                text = "Which Tom do you want to buy?",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = ibmPlexSans,
                color = QuickSilver
            )

        }
        HorizontalSpacer(modifier = Modifier.weight(1f))
        BadgedBox(
            modifier = Modifier.padding(end = 4.dp),
            badge = {
                Badge(containerColor = DarkCerulean) {
                    Text("3", color = Color.White, fontSize = 10.sp)
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = LightGray,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = null,
                )
            }
        }


    }

}