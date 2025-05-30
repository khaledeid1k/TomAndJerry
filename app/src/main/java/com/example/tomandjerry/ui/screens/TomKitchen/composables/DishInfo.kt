package com.example.tomandjerry.ui.screens.TomKitchen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.composables.CheesesItem
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.EerieBlack
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun DishInfo(modifier: Modifier = Modifier) {
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Electric Tom pasta",

                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = ibmPlexSans,
                    color = EerieBlack
                )
                VerticalSpacer(space = 12.dp)
                CheesesItem(price = "5", modifier = Modifier)
            }
            IconButton(
                onClick = { },
            ) {
                Image(
                    painter = painterResource(id = R.drawable.favorit),
                    contentDescription = null
                )
            }
        }

        Text(
            "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = ibmPlexSans,
            color = darkOverlay,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}