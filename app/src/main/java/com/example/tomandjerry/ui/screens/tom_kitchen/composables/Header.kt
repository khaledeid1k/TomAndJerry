package com.example.tomandjerry.ui.screens.tom_kitchen.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun HeaderTomKitchenScreen(
    icon: Int,
    title: String
) {
    Row {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(
            text = title,
            color = Color.White,
            fontSize = 16.sp,
            fontFamily = ibmPlexSans,
            fontWeight = FontWeight.Medium,

            )
    }
}