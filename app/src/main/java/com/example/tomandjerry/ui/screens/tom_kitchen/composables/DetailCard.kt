package com.example.tomandjerry.ui.screens.tom_kitchen.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.composables.VerticalSpacer
import com.example.tomandjerry.ui.theme.AzureishWhite
import com.example.tomandjerry.ui.theme.DarkGrayDimmed
import com.example.tomandjerry.ui.theme.OceanBlue
import com.example.tomandjerry.ui.theme.darkOverlay
import com.example.tomandjerry.ui.theme.ibmPlexSans

@Composable
fun DetailCard(
    modifier: Modifier = Modifier,
    icon: Int,
    title: String,
    description: String,
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = AzureishWhite
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = OceanBlue
            )
            VerticalSpacer(space = 12.dp)
            Text(
                title,
                fontSize = 14.sp,
                maxLines = 1,
                fontWeight = FontWeight.Medium,
                fontFamily = ibmPlexSans,
                color = darkOverlay
            )
            VerticalSpacer(space = 4.dp)
            Text(
                description,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Medium,
                fontFamily = ibmPlexSans,
                color = DarkGrayDimmed
            )

        }
    }

}