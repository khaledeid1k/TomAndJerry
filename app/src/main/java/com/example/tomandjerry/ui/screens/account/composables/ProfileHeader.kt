package com.example.tomandjerry.ui.screens.account.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.tomandjerry.ui.theme.JellyBeanBlue
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun ProfileHeader(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp, bottom = 8.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.mirror),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(width = 64.dp, height = 64.dp)
                .clip(RoundedCornerShape(16.dp))

        )
        VerticalSpacer(space = 4.dp)
        Text(
            "Tom",
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = ibmPlexSans,
            color = Color.White,
        )
        VerticalSpacer(space = 4.dp)
        Text(
            "specializes in failure!",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = ibmPlexSans,
            color = Color.White,
        )
        VerticalSpacer(space = 4.dp)
        Text(
            modifier = Modifier
                .background(
                    JellyBeanBlue,
                    shape = RoundedCornerShape(40.dp)
                )
                .padding(horizontal = 12.dp, vertical = 4.dp),
            text = "Edit foolishness",
            fontSize = 10.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = ibmPlexSans,
            color = Color.White,
        )
    }
}